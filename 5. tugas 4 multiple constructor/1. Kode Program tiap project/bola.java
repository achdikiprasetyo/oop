/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bangunruang;

/**
 *
 * @author ASUS
 */
public class bola {
    double radius,volume,calculate_vol;
    public bola(double radius){
        this.radius=radius;
    }
    public bola(){
        this.radius=0;
    }
    public void SetRadius(double radius){
        this.radius = radius;
    }
    public void ComputeAndSetVolume(){
        calculate_vol=(4*3.14*this.radius*this.radius*this.radius)/3;
        this.volume = calculate_vol;
    }
    public double GetVolume(){
        this.ComputeAndSetVolume();
        return volume;
    }
}
