/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author ASUS
 */
public class kubus{
    public int sisi,volume;
    public kubus(int sisi){
        this.sisi=sisi;
    }
    public kubus(){
        this.sisi=2;
    }
    public void SetSisi(int sisi){
        this.sisi=sisi;
        
    }
    
    public void ComputeAndSetVolume(){
        int calculate_vol = this.sisi*this.sisi*this.sisi;
        this.volume=calculate_vol;
    }
    
    public int getVolume(){
        this.SetSisi(this.sisi);
        this.ComputeAndSetVolume();
        return this.volume;
        
    }
}
