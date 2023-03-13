/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas3;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class Tugas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angkaA,angkaB,pilihan;
        Scanner input = new Scanner(System.in);
        System.out.println("1. Pertambahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Modulus");
        System.out.println("6. Tampilkan semua");
        System.out.println("masukkan pilihan : ");
        pilihan = input.nextInt();
        
        System.out.println("Masukkan angka pertama : ");
        angkaA =input.nextInt();
        System.out.println("Masukkan angka kedua : ");
        angkaB =input.nextInt();
        
        
        operator kalkulator = new operator();
        
        if(pilihan==1){
            System.out.println("hasil penambahan : "+kalkulator.penambahan(angkaA,angkaB));
        }
        else if(pilihan==2){
            System.out.println("hasil pengurangan : "+kalkulator.pengurangan(angkaA,angkaB));
        }
        else if (pilihan==3){
            System.out.println("hasil perkalian : "+kalkulator.perkalian(angkaA,angkaB));
        }
        else if(pilihan==4){
            System.out.println("Hasil pembagian : "+kalkulator.pembagian(angkaA,angkaB));
        }
        else if(pilihan==5){
            System.out.println("Hasil sisa bagi : "+kalkulator.modulus(angkaA,angkaB));
        }
        else if(pilihan==6){
        System.out.println("hasil penambahan : "+kalkulator.penambahan(angkaA,angkaB));
        System.out.println("hasil pengurangan : "+kalkulator.pengurangan(angkaA,angkaB));
        System.out.println("hasil perkalian : "+kalkulator.perkalian(angkaA,angkaB));
        System.out.println("Hasil pembagian : "+kalkulator.pembagian(angkaA,angkaB));
        System.out.println("Hasil sisa bagi : "+kalkulator.modulus(angkaA,angkaB));
        
    }
        else{
            System.out.println("pilihan tidak ada");
        }
    }
}

