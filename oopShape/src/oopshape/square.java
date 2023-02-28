/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopshape;

/**
 *
 * @author ASUS
 */
public class square {
    int lenghtofside = 8;
    
    public int calculatedarea(){
        int area;
        area = this.lenghtofside * this.lenghtofside;
        return area;
    }
    public int calculatedperimeter(){
        int perimeter;
        perimeter = this.lenghtofside * 4;
        return perimeter;
    }
}
