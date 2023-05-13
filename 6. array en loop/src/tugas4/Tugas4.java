/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas4;

/**
 *
 * @author ASUS
 */
public class Tugas4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        kubus kotak = new kubus(10);
        kubus default_kotak = new kubus ();

        System.out.println("Kubus dengan sisi"+kotak.sisi+" adalah"+kotak.getVolume());
        System.out.println("Kubus dengan sisi"+kotak.sisi+" adalah"+default_kotak.getVolume());

        bola hitung_bola = new bola(30);
        bola default_bola = new bola();
        System.out.println("Volume bola adalah = "+hitung_bola.GetVolume());
        System.out.println("Volume bola adalah = "+default_bola.GetVolume());

        LimasSegiEmpat hitung_limas = new LimasSegiEmpat(4,8);
        LimasSegiEmpat default_limas = new LimasSegiEmpat();
        System.out.println("Volume Limas Segi Empat adalah = "+hitung_limas.GetVolume());
        System.out.println("Volume Limas Segi Empat adalah = "+default_limas.GetVolume());

        tabung hitung_tabung = new tabung(5,7);
        tabung default_tabung = new tabung();
        System.out.println("Volume tabung adalah = "+hitung_tabung.GetVolume());
        System.out.println("Volume tabung adalah = "+default_tabung.GetVolume());

        balok balok_hitung = new balok(15,7,4);
        balok balok_default = new balok();
        System.out.println("Volume balok adalah = "+balok_hitung.GetVolume());
        System.out.println("Volume balok adalah = "+balok_default.GetVolume());
        
        System.out.println("==========Tugas array + enhanced loop==========");
       double [] rata_volume = {balok_hitung.GetVolume(),hitung_tabung.GetVolume(),hitung_limas.GetVolume(),hitung_bola.GetVolume(),kotak.getVolume()};
       double hasil_rata = 0;
       for (double x : rata_volume){
           hasil_rata += x ; 
       }
       hasil_rata = hasil_rata/5;
        System.out.println("Hasil rata-rata volume = "+hasil_rata);
           
    }
    
}
