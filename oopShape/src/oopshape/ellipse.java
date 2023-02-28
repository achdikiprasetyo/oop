/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopshape;

/**
 *
 * @author ASUS
 */
public class ellipse {
    double phi  = 3.14, panjang = 10, lebar = 5;
    
    public double calculatedArea(){
        double area;
        area = (this.phi*this.panjang*this.lebar)/4;
        return area;
    }
    public double calculatedPerimeter(){
        double perimeter;
        perimeter = (this.phi*(this.panjang+this.lebar))/2;
        return perimeter;
    }
}
