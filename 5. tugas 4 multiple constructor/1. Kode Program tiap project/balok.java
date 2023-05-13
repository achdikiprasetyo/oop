/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

/**
 *
 * @author ASUS
 */
public class balok {
    public int panjang,lebar,tinggi,volume;
    public balok(int panjang, int lebar,int tinggi){
        this.panjang = panjang;
        this.lebar = lebar ;
        this.tinggi = tinggi ;
        
    }
    public balok(){
        this.panjang = 1;
        this.lebar = 1 ;
        this.tinggi = 1 ;
    }
    public void SetPanjang(int panjang){
        this.panjang = panjang;
    }
    public void SetLebar(int lebar){
        this.lebar = lebar;
    }
    public void SetTinggi(int tinggi){
        this.tinggi = tinggi;
    }
    public void ComputeAndSetVolume(){
        int calculate_vol = this.panjang*this.lebar*this.tinggi;
        this.volume = calculate_vol;
    }
    public int GetVolume(){
        this.ComputeAndSetVolume();
        return this.volume;
    }
}
