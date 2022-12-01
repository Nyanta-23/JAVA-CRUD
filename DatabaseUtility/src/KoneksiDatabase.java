/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kuro
 */


import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;



public class KoneksiDatabase {
    
    private static Connection koneksi;
    
    public static Connection getKoneksi(){
        if(koneksi == null){
            try{
                Driver driver = new Driver();
                DriverManager.registerDriver(driver);
                String url = "jdbc:mysql://localhost:3306,127.0.0.1:3306/db_toko";
                String user = "root";
                String pass = "";
                koneksi = DriverManager.getConnection(url, user, pass);
                System.out.println("Koneksi Berhasil");
                
            } catch(SQLException ex){
                System.out.println("Koneksi Gagal");
                System.out.println("Pesan : " + ex.getMessage() + "/nOn Koneksi Database");
            }
        }
       return koneksi;
    }
}
