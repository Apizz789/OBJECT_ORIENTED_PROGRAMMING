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
public class main {
    public static void main(String[] args) {
        Circle c1 = new Circle(1);
        Circle c2 = new Circle(2);
        
        Rectangle r1 = new Rectangle(5);
        Rectangle r2 = new Rectangle(7);
        

        
        
        
        System.out.println(Circle.max(c1, c2));
        c1.HowToColor();
        System.out.println(Rectangle.max(r1, r2));
        r1.HowToColor();
        
    }
}
