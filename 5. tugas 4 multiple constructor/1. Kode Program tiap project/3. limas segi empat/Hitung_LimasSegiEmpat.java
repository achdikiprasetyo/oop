/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hitung_limassegiempat;

/**
 *
 * @author ASUS
 */
public class Hitung_LimasSegiEmpat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LimasSegiEmpat hitung_limas = new LimasSegiEmpat(4,8);
        LimasSegiEmpat default_limas = new LimasSegiEmpat();
        System.out.println("Volume Limas Segi Empat adalah = "+hitung_limas.GetVolume());
        System.out.println("Volume Limas Segi Empat adalah = "+default_limas.GetVolume());
    }
    
}
