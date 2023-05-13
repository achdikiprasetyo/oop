/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package busumum;

/**
 *
 * @author ASUS
 */
public class BusUmum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jumlahPenumpang = 5,jumlahTunggu;
        bus bus = new bus(20);
        halte porong = new halte("PORONG", 2,2,1,"surabaya");
        
        
        bus.berangkat();
        System.out.println("============");
        jumlahTunggu = porong.getPenumpangMenunggu();
        System.out.println("->  Halte "+porong.getNama()+" "+jumlahTunggu+" Penumpang menunggu");
        bus.turun(porong);
        bus.naik(porong);
        jumlahPenumpang += porong.getNaik();
        jumlahPenumpang -= porong.getTurun();
        System.out.println("\t- Tujuan : "+porong.getTujuan());
        System.out.println("Jumlah penumpang = "+jumlahPenumpang);
        jumlahTunggu = porong.getPenumpangMenunggu()-porong.getPenumpangMenunggu();
        System.out.println("->  Halte "+porong.getNama()+" "+jumlahTunggu+" Penumpang menunggu");
        
        System.out.println("=======================================================");
        halte surabaya = new halte("SURABAYA", 5,5,1,"gersik");
        
        jumlahTunggu = surabaya.getPenumpangMenunggu();
        System.out.println("->  Halte "+surabaya.getNama()+" "+jumlahTunggu+" Penumpang menunggu");
        bus.turun(surabaya);
        bus.naik(surabaya);
        jumlahPenumpang += surabaya.getNaik();
        jumlahPenumpang -= surabaya.getTurun();
        System.out.println("\t- Tujuan : "+surabaya.getTujuan());
        System.out.println("Jumlah penumpang = "+jumlahPenumpang);
        jumlahTunggu = surabaya.getPenumpangMenunggu()-surabaya.getPenumpangMenunggu();
        System.out.println("->  Halte "+surabaya.getNama()+" "+jumlahTunggu+" Penumpang menunggu");
        
        System.out.println("=======================================================");
        halte gersik = new halte("GERSIK", 2,2,4,"sidoarjo");
        
        jumlahTunggu = gersik.getPenumpangMenunggu();
        System.out.println("->  Halte "+gersik.getNama()+" "+jumlahTunggu+" Penumpang menunggu");
        bus.turun(gersik);
        bus.naik(gersik);
        jumlahPenumpang += gersik.getNaik();
        jumlahPenumpang -= gersik.getTurun();
        System.out.println("\t- Tujuan : "+gersik.getTujuan());
        System.out.println("Jumlah penumpang = "+jumlahPenumpang);
        jumlahTunggu = gersik.getPenumpangMenunggu()-gersik.getPenumpangMenunggu();
        System.out.println("->  Halte "+gersik.getNama()+" "+jumlahTunggu+" Penumpang menunggu");
    }
}


    
    

