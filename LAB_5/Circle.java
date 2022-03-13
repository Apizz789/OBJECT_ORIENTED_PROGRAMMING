/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_5;

/**
 *
 * @author Apirak Oulis
 */
public class Circle extends GeometricObject implements Colorable{

    public Circle(int r) {
        this.radius = r;
    }

    @Override
    public void HowToColor() {
        System.out.println("Color Somethings");
    }

    @Override
    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" + radius + '}';
    }
    
    
    
}
