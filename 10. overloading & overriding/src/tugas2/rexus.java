/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author ASUS
 */
public class rexus extends keyboard {
    private final int harga;
    public rexus (String nama, String merek, int tahun, int harga){
        super(nama, tahun, merek);
        this.harga = harga;
    }
    
    @Override
    public String struk() {
        return super.struk() + ", harga normal: " + this.harga;
    }
    
    public String struk(int harga){
        return super.struk()+", harga berubah: "+harga;
    }
    
}
