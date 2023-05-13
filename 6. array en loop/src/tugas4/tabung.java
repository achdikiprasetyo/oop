/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author ASUS
 */
public class tabung {
    public double radius,tinggi,volume;
    public tabung(double radius,double tinggi){
        this.radius = radius;
        this.tinggi = tinggi;
    }
    public tabung(){
        this.radius = 1;
        this.tinggi = 2;
    }
    public void SetRadius(double radius){
        this.radius = radius;
    }
    public void SetTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public void ComputeAndSetVolume(){
        double calculate_vol = 3.14*this.radius*this.radius*this.tinggi;
        this.volume = calculate_vol;
    }
    public double GetVolume(){
        this.ComputeAndSetVolume();
        return volume;
    }
}
