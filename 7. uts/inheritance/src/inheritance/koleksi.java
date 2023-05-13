/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author ASUS
 */
public class koleksi {
    protected String judul;
    protected String penerbit;
    protected int tahun;
    
    public koleksi (String judul, String penerbit, int tahun){
        this.judul = judul;
        this.penerbit = penerbit;
        this.tahun = tahun;
    
    }
    
    public String toString(){
        return "judul : "+this.judul+", penerbit : "+this.penerbit+", tahun : "+this.tahun;
    }
}
