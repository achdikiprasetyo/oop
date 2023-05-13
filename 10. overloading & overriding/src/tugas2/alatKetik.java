/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author ASUS
 */
public class alatKetik {
    protected String nama;
    protected int tahun;
    
    public alatKetik (String nama, int tahun){
        this.nama = nama;
        this.tahun = tahun;
    }
    
    public String struk(){
        return this.nama+this.tahun;
    }
    
}
