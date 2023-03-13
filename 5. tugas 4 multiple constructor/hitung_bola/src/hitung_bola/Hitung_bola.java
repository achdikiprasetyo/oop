/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hitung_bola;

/**
 *
 * @author ASUS
 */
public class Hitung_bola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        bola hitung_bola = new bola(30);
        bola default_bola = new bola();
        System.out.println("Volume bola adalah = "+hitung_bola.GetVolume());
        System.out.println("Volume bola adalah = "+default_bola.GetVolume());
    }
    
}
