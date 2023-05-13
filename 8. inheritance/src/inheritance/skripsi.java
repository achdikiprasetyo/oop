/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author ASUS
 */
public class skripsi extends buku {
    private String npm;
    public skripsi (String npm, String penulis, String judul, String penerbit, int tahun){
        super(penulis,judul,penerbit,tahun);
        this.npm = npm;
    }
    
    public String toString(){
        return "npm: "+this.npm+", judul: "+this.judul+", penulis: "+this.penulis+", penerbit: "+this.penerbit+", tahun: "+this.tahun;
    }
    
}
