/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author ASUS
 */
public class buku extends koleksi{
    protected String penulis;
    public buku(String judul,String penulis, String penerbit, int tahun){
        super(judul,penerbit,tahun);
        this.penulis = penulis;
    }
    
    public String toString(){
        return "judul: "+this.judul+", penulis: "+this.penulis+", penerbit: "+this.penerbit+", tahun: "+this.tahun;
    }
}
