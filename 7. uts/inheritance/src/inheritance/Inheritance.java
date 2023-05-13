/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author ASUS
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        koleksi k1 = new koleksi("Cara Pintar Mendongeng","sinar",2015);
        System.out.println(k1.toString());
        
        buku b1 = new buku ("si kancil","ahmad fauzi","gramedia",2019);
        System.out.println(b1.toString());
        
        skripsi s1 = new skripsi ("210801010055","Rindu Ibu","mujib","cahaya font",2018);
        System.out.println(s1.toString());
        
        majalah m1 = new majalah ("hidup di hutan","terbatas","maulana",2021);
        System.out.println(m1.toString());
                
    }
    
}
