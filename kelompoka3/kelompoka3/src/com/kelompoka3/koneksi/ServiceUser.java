package com.kelompoka3.koneksi;

import com.kelompoka3.model.ModelLogin;
import com.kelompoka3.model.ModelUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Random;

public class ServiceUser {

    private final Connection con;

    public ServiceUser() {
        con = DatabaseConnection.getInstance().getConnection();
    }

    public ModelUser login(ModelLogin login) throws SQLException {
        ModelUser data = null;
        PreparedStatement p = con.prepareStatement("SELECT userId, email, password from `pegawai` where BINARY(email)=? and BINARY(`password`)=? and `Status`='Verified' limit 1");
        p.setString(1, login.getEmail());
        p.setString(2, login.getPassword());
        ResultSet r = p.executeQuery();
        if (r.first()) {
            int userId = r.getInt(1);
            String email = r.getString(2);
            String username = r.getString(3);
            data = new ModelUser(userId, email, username, "");
        }
        r.close();
        p.close();
        return data;
    }

    public void insertUser(ModelUser user) throws SQLException {
        PreparedStatement p = con.prepareStatement("INSERT INTO pegawai (namaLengkap, email, username, password, alamat, verifyCode, idKedudukan) VALUES (?,?,?,?,?,?, 1)", PreparedStatement.RETURN_GENERATED_KEYS);
        String code = generateVerifyCode();
        p.setString(1, user.getNamaLengkap());
        p.setString(2, user.getEmail());
        p.setString(3, user.getUsername());
        p.setString(4, user.getPassword());
        p.setString(5, user.getAlamat());
        p.setString(6, code);
        p.execute();
        ResultSet r = p.getGeneratedKeys();
        r.first();
        int userId = r.getInt(1);
        r.close();
        p.close();
        user.setUserId(userId);
        user.setVerifyCode(code);
    }

    public boolean checkKedudukanAdmin(String user) throws SQLException {
        boolean duplicate = false;
        PreparedStatement p = con.prepareStatement("SELECT `userId` FROM `pegawai` WHERE `email` = ? and `idKedudukan` = '1' limit 1 ");
        p.setString(1, user);
        ResultSet r = p.executeQuery();
        if (r.first()) {
            duplicate = true;
        }
        r.close();
        p.close();
        return duplicate;
    }
    
    public boolean checkKedudukanKaryawan(String user) throws SQLException {
        boolean duplicate = false;
        PreparedStatement p = con.prepareStatement("SELECT `userId` FROM `pegawai` WHERE `email` = ? and `idKedudukan` = '2' limit 1 ");
        p.setString(1, user);
        ResultSet r = p.executeQuery();
        if (r.first()) {
            duplicate = true;
        }
        r.close();
        p.close();
        return duplicate;
    }

    private String generateVerifyCode() throws SQLException {
        DecimalFormat df = new DecimalFormat("000000");
        Random ran = new Random();
        String code = df.format(ran.nextInt(1000000)); //untuk generate code verifikasi secara random
        while (checkDuplicateCode(code)) {
            code = df.format(ran.nextInt(1000000));
        }
        return code;
    }

    private boolean checkDuplicateCode(String code) throws SQLException {
        boolean duplicate = false;
        PreparedStatement p = con.prepareStatement("SELECT `userId` FROM `pegawai` WHERE `verifyCode` = ? limit 1 ");
        p.setString(1, code);
        ResultSet r = p.executeQuery();
        if (r.first()) {
            duplicate = true;
        }
        r.close();
        p.close();
        return duplicate;
    }

    public boolean checkDuplicateUser(String user) throws SQLException {
        boolean duplicate = false;
        PreparedStatement p = con.prepareStatement("SELECT `userId` FROM `pegawai` WHERE `username` = ? limit 1 ");
        p.setString(1, user);
        ResultSet r = p.executeQuery();
        if (r.first()) {
            duplicate = true;
        }
        r.close();
        p.close();
        return duplicate;
    }

    public boolean checkDuplicateEmail(String user) throws SQLException {
        boolean duplicate = false;
        PreparedStatement p = con.prepareStatement("SELECT `userId` FROM `pegawai` WHERE `email` = ? and `status` = 'Verified' limit 1 ");
        p.setString(1, user);
        ResultSet r = p.executeQuery();
        if (r.first()) {
            duplicate = true;
        }
        r.close();
        p.close();
        return duplicate;
    }

    public void succesVerify(int userId) throws SQLException {
        PreparedStatement p = con.prepareStatement("UPDATE `pegawai` SET `verifyCode` = '', `status` = 'Verified' WHERE `userId` = ? limit 1 ");
        p.setInt(1, userId);
        p.execute();
        p.close();
    }

    public boolean verifyCodeWithUser(int userId, String code) throws SQLException {
        boolean verify = false;
        PreparedStatement p = con.prepareStatement("SELECT `userId` FROM `pegawai` WHERE `userId` = ? and `verifyCode` = ? limit 1 ");
        p.setInt(1, userId);
        p.setString(2, code);
        ResultSet r = p.executeQuery();
        if (r.first()) {
            verify = true;
        }
        r.close();
        p.close();
        return verify;
    }
}
