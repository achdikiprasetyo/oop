/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulator;

/**
 *
 * @author ASUS
 */
public class calculator {
    int angkaA=10, angkaB=5 ;
    public int penambahan(){
        int hitung = this.angkaA+this.angkaB;
        return hitung;
}
    
    public double pembagian(){
        double hitung = this.angkaA/this.angkaB;
        return hitung;
}
   
    public double perkalian(){
        double hitung = this.angkaA*this.angkaB;
        return hitung;
}
    public int pengurangan(){
        int hitung = this.angkaA-this.angkaB;
        return hitung;
}
    
    public int modulus(){
        int hitung = this.angkaA%this.angkaB;
        return hitung;
}
}
    
