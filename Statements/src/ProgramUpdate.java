/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Kuro
 */

 import java.sql.Connection;
 import java.sql.Statement;
 import java.sql.SQLException;

public class ProgramUpdate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection koneksi = KoneksiDatabase.getKoneksi();
        Statement statement = null;
        
        try {
                statement = koneksi.createStatement();
            System.out.println("Statement berhasil dibuat");
            String url= "UPDATE tb_barang SET nama_barang='PENSIL 2B',jumlah_barang=20,harga_barang=2500 WHERE id_barang='B003'";
            statement.executeUpdate(url);
        }catch(SQLException ex){
            System.out.println("Statement gagal dibuat");
            System.out.println("Pesan : "+ex.getMessage());
        }finally{
            if(statement !=null){
                try{
                statement.close();
                System.out.println("Statement berhasil ditutup");
                }catch(SQLException ex){
                    System.out.println("Statement gagal ditutup");
                    System.out.println("Pesan : "+ex.getMessage());
                }
            }
        }
    }
    
}
