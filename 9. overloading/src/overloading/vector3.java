/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading;

/**
 *
 * @author ASUS
 */
public class vector3 {
    public int []vector;
    public vector3(int [] vector){
        this.vector = vector;
    }
    
    public int perkalian (int [] vector){
        int hasil = 0;
        for (int i = 0;i<vector.length;i++){
            hasil += this.vector[i]*vector[i];
        }
        return hasil;
        
    }
    
    public int [] perkalian (int skalar){
        int [] hasil = new int[3];
        for( int i = 0;i<this.vector.length;i++){
            hasil[i]=this.vector[i]*skalar;
        }
        return hasil;
    }
}
