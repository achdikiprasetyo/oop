/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalkulator;

/**
 *
 * @author ASUS
 */
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calculator operator = new calculator();
        System.out.println("hasil penambahan : "+operator.penambahan());
        System.out.println("hasil pengurangan : "+operator.pengurangan());
        System.out.println("hasil perkalian : "+operator.perkalian());
        System.out.println("Hasil pembaguan : "+operator.pembagian());
    }
    
}
