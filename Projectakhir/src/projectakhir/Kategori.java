/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectakhir;

/**
 *
 * @author Praktikan
 */
public class Kategori {
    private String nama_kategori;
    Barang barang;
    
    public Kategori() {
    }
    
    public Kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }
    
    public String getNama_kategori(){
        return nama_kategori;
    }
    
    public void setNama_kategori(String nama_kategori) {
        this.nama_kategori = nama_kategori;
    }
    
    public void getProduk(){
        
    }
}

