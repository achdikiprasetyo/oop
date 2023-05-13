/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overloading;

/**
 *
 * @author ASUS
 */
public class Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        vector3 v1 = new vector3(new int [] {1,2,3});
        vector3 v2 = new vector3(new int [] {4,5,6});
        int hasil1 = v1.perkalian(v2.vector);
        int []hasil2 = v1.perkalian(5);
        System.out.println("Hasil pertama : "+hasil1);
        System.out.println("Hasil pertama : "+hasil2[0]+" "+hasil2[1]+" "+hasil2[2]);
    }
    
}
