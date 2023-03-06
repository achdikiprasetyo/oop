/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package totalgaji;

/**
 *
 * @author ASUS
 */
public class Totalgaji {

   String pengalaman;
   String skill;
   String departemen;
   
   public Totalgaji (String InPengalaman, String InSkill, String InDepartemen){
       pengalaman = InPengalaman;
       skill = InSkill;
       departemen = InDepartemen;
   }
   
   int bonusDepartemen(){
   if (departemen == "it") {
            return 8000000;
            
        }
        else if (departemen == "hrd") {
            return 5000000;
       
        }
        else{
            return 4000000;
        }
  
}
   int bonusPengalaman(){     
        if (pengalaman == "pemula") {
            return 500000;
            
        }
        else if (pengalaman == "menengah") {
            return 1000000;
            
        }
        else{
            return 2000000;
        }
   }
    int bonusSkill(){    
      if (skill == "web") {
           return 1000000;
            
        }
        else if (skill == "mobile") {
            return 2000000;
            
        }
        else if (skill == "desktop") {
            return 2500000;
        }
       return 0;
    }
}
           
           
   
