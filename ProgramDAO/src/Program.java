/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Kuro
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        fasilitas perintah = new fasilitas();
        barang atk = new barang();
        
//        Insert
        atk.setId_barang("B002");
        atk.setNama_barang("Buku Gambar");
        atk.setJumlah_barang(12);
        atk.setHarga_barang(3000);
        perintah.insert(atk);
        
//        Update
        atk.setId_barang("B002");
        atk.setNama_barang("BUKU GAMBAR");
        atk.setJumlah_barang(12);
        atk.setHarga_barang(3000);
        perintah.update(atk);

    }
    
}
