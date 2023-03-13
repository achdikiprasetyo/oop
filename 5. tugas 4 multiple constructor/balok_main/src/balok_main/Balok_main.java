/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package balok_main;

/**
 *
 * @author ASUS
 */
public class Balok_main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        balok balok_hitung = new balok(15,7,4);
        balok balok_default = new balok();
        System.out.println("Volume balok adalah = "+balok_hitung.GetVolume());
        System.out.println("Volume balok adalah = "+balok_default.GetVolume());
    }
    
}
