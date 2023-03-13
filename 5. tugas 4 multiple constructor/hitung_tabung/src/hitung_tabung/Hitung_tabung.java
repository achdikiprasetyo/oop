/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hitung_tabung;

/**
 *
 * @author ASUS
 */
public class Hitung_tabung {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tabung hitung_tabung = new tabung(5,7);
        tabung default_tabung = new tabung();
        System.out.println("Volume tabung adalah = "+hitung_tabung.GetVolume());
        System.out.println("Volume tabung adalah = "+default_tabung.GetVolume());
    }
    
}
