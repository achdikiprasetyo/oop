/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package busumum;

/**
 *
 * @author ASUS
 */
public class bus {
    private int maxPenumpang;
    
    public bus(int maxPenumpang) {
        this.maxPenumpang = maxPenumpang;
    }
    
    public void berangkat() {
        System.out.println("-> Bus Berangkat dari PULL/Kantor");
        System.out.println("Jumlah penumpang: " + 5);
    }
    
    public void turun(halte turun_halte) {
        int jumlahTurun = turun_halte.getTurun();
        System.out.println("\t"+jumlahTurun+" Penumpang Turun di halte "+turun_halte.getNama());
    }
    public void naik(halte naik_halte) {
        
        int jumlahNaik = naik_halte.getNaik();
        if (jumlahNaik < this.maxPenumpang) {
            System.out.println("\t"+jumlahNaik+" Penumpang Naik");
            
        } else {
            System.out.println("----penumpang terlalu banyak-----");
            System.exit(0);
        }
    }
        
}
    






