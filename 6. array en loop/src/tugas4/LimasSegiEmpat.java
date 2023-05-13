/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas4;

/**
 *
 * @author ASUS
 */
public class LimasSegiEmpat {
    double sisi,tinggi,volume;
    public LimasSegiEmpat(double sisi,double tinggi){
        this.sisi = sisi;
        this.tinggi = tinggi;
    }
    public LimasSegiEmpat(){
        this.sisi = 1;
        this.tinggi = 2;
    }
    public void SetSisi(double sisi){
        this.sisi = sisi;
    }
    public void SetTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public void ComputeAndSetVolume(){
        double calculate_vol = 0.3*(this.sisi*this.sisi)*this.tinggi;
        this.volume = calculate_vol;
    }
    public double GetVolume(){
        this.ComputeAndSetVolume();
        return this.volume;
    }
}
