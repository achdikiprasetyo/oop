/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas2;

/**
 *
 * @author ASUS
 */
public class Tugas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        alatKetik ak1 = new alatKetik("Keyboard",2017);
        keyboard k1 = new keyboard("Mechanical",2018,"rexus");
        System.out.println(k1.struk());
        System.out.println(k1.struk("votre"));
        
        rexus r1 = new rexus ("Wireless","rexus",2019,10000);
        System.out.println(r1.struk());
        System.out.println(r1.struk(12000));
    }
    
}
