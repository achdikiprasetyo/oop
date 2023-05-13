/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busumum;

/**
 *
 * @author ASUS
 */
public class halte {
    private String nama,tujuan;
    int penumpangMenunggu;
    private int naik,turun;
    
    public halte(String nama, int penumpangMenunggu,int naik,int turun,String tujuan) {
        this.nama = nama;
        this.naik = naik;
        this.turun = turun;
        this.penumpangMenunggu = penumpangMenunggu;
        this.tujuan = tujuan;
    }
    
    public String getNama() {
        return nama;
    }
    
    public String getTujuan(){
        return tujuan;
    }
    
    public int getTurun(){
        return turun;
    }
    
    public int getNaik() {
        return naik;
    }
    
     public int getPenumpangMenunggu() {
        return this.penumpangMenunggu;
    }

     
}
