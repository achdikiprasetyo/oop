/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package totalgaji;

/**
 *
 * @author ASUS
 */
public class skill {
    public static void main (String[] args){
        String nama = "diki";
        String alamat = "Sidoarjo";
        int gajitotal=0;
        
        System.out.println("Nama Pekerja : "+nama);
        System.out.println("Alamat pekerja : "+alamat);
        Totalgaji gajipekerja = new Totalgaji("pemula","mobile","hrd");
        gajitotal = gajitotal+gajipekerja.bonusDepartemen();
        System.out.println("Karena departemen anda "+gajipekerja.departemen+" maka gaji anda : "+gajipekerja.bonusDepartemen());
        gajitotal = gajitotal+gajipekerja.bonusPengalaman();
        System.out.println("Karena Pengalaman anda " +gajipekerja.pengalaman+" maka gaji anda bertambah menjadi : "+gajipekerja.bonusPengalaman());
        gajitotal = gajitotal+gajipekerja.bonusSkill();
        System.out.println("Karena skill anda "+gajipekerja.skill+" maka gaji anda bertambah menjadi : "+gajipekerja.bonusSkill());
        System.out.println("Jadi total gaji anda  adalah : Rp "+gajitotal);
    }
}
