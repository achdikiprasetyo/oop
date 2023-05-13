/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author ASUS
 */
public class majalah extends koleksi {
    private String edisi;
    public majalah (String judul,String edisi, String penerbit, int tahun){
        super(judul,penerbit,tahun);
        this.edisi = edisi;
    }
    
    public String toString (){
        return "judul: "+this.judul+", edisi: "+this.edisi+", penerbit: "+this.penerbit+", tahun: "+this.tahun;
    }
}
