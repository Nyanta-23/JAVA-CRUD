/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Kuro
 */

import com.stripbandunk.jwidget.annotation.TableColumn;
public class barang {
 
 @TableColumn(number=1, name ="KODE BARANG")
 private String id_barang;
 @TableColumn(number=2, name ="NAMA BARANG")
 private String nama_barang;
 @TableColumn(number = 3, name ="JUMLAH")
 private int jumlah_barang;
 @TableColumn(number = 4, name ="HARGA")
 private int harga_barang;

    public String getId_barang() {
        return id_barang;
    }

    public void setId_barang(String id_barang) {
        this.id_barang = id_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public int getJumlah_barang() {
        return jumlah_barang;
    }

    public void setJumlah_barang(int jumlah_barang) {
        this.jumlah_barang = jumlah_barang;
    }

    public int getHarga_barang() {
        return harga_barang;
    }

    public void setHarga_barang(int harga_barang) {
        this.harga_barang = harga_barang;
    }
      

}
