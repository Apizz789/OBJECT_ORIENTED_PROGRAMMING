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
public class Rectangle extends GeometricObject implements Colorable{

    @Override
    public void HowToColor() {
        System.out.println("Color all Four sides");
    }
    
    public Rectangle(int r) {
        this.radius = r;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius;
    }
    
       @Override
    public String toString() {
        return "Rectangle{" + radius + '}';
    }
}
