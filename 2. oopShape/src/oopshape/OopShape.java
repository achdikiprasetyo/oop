/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oopshape;

/**
 *
 * @author ASUS
 */
public class OopShape {

    
    public static void main(String[] args) {
        square persegi = new square();
        System.out.println("Luas persegi adalah : "+persegi.calculatedarea());
        System.out.println("Keliling persegi adlaah : "+persegi.calculatedperimeter());
        persegi.calculatedarea();
        persegi.calculatedperimeter();
        
        rectangle persegiPanjang = new rectangle ();
        System.out.println("Luas persegi panjang : "+persegiPanjang.calculatedArea());
        System.out.println("Keliling persegi panjang : "+persegiPanjang.calculatedPerimeter());
        
        circle lingkaran = new circle ();
        System.out.println("Luas lingkaran adalah : "+lingkaran.calculatedArea());
        System.out.println("Keliling lingkaran adalah : "+lingkaran.calculatedPerimeter());
        
        ellipse elips = new ellipse();
        System.out.println("Luas elips adalah : "+elips.calculatedArea());
        System.out.println("Keliling elips adalah : "+elips.calculatedPerimeter());
    }
    
}
