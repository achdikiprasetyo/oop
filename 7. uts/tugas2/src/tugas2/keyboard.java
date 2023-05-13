/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author ASUS
 */
public class keyboard extends alatKetik {
    protected String merek;
    
    public keyboard (String nama, int tahun, String merek){
        super(nama,tahun);
        this.merek = merek;
    }
    
    public String struk (){
        return "Jenis: "+this.nama+", Merek normal: "+this.merek+", Tahun: "+this.tahun;
    }
    
    public String struk (String merek){
        return "Jenis: "+this.nama+", Merek rubah: "+merek+", Tahun: "+this.tahun;
    }
    
}
