/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopshape;

/**
 *
 * @author ASUS
 */
public class circle {
    double phi = 3.14, jari=5;
 
    public double calculatedArea(){
        double area;
        area = this.phi*this.jari*this.jari;
        return area;
    }
    
    public double calculatedPerimeter(){
        double perimeter;
        perimeter = 2*this.phi*this.jari;
        return perimeter;
    }
}
