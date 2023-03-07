/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas3;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class operator {
    int angka_satu,angka_dua;
    
    
    
    public int penambahan(int angkaA, int angkaB){
        angka_satu=angkaA;
        angka_dua=angkaB;
        int hitung = this.angka_satu+this.angka_dua;
        return hitung;
}
    
    public double pembagian(int angkaA, int angkaB){
        angka_satu=angkaA;
        angka_dua=angkaB;
        double hitung = this.angka_satu/this.angka_dua;
        return hitung;
}
   
    public double perkalian(int angkaA, int angkaB){
        angka_satu=angkaA;
        angka_dua=angkaB;
        double hitung = this.angka_satu*this.angka_dua;
        return hitung;
}
    public int pengurangan(int angkaA, int angkaB){
        angka_satu=angkaA;
        angka_dua=angkaB;
        int hitung = this.angka_satu-this.angka_dua;
        return hitung;
}
    
    public int modulus(int angkaA, int angkaB){
        angka_satu=angkaA;
        angka_dua=angkaB;
        int hitung = this.angka_satu%this.angka_dua;
        return hitung;
}
}
