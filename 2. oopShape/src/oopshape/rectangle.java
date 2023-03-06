/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopshape;

/**
 *
 * @author ASUS
 */
public class rectangle {
    int panjang = 5;
    int lebar = 2;
    
    public int calculatedArea(){
        int area;
        area = this.panjang * this.lebar;
        return area;
    }
    
    public int calculatedPerimeter(){
        int perimeter;
        perimeter = (this.panjang * this.lebar)*2;
        return perimeter;
    }
}
