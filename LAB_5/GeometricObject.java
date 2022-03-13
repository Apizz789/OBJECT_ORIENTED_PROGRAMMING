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
public abstract class GeometricObject implements Comparable<GeometricObject>{

    int radius = 0;
    
    public abstract double getArea();
    @Override
    public int compareTo(GeometricObject o) {
       if(this.getArea() > o.getArea()){
            return 1;
       }else if(  this.getArea() < o.getArea()){
            return -1;
       }else return 0;

    }
   
    static GeometricObject max(GeometricObject o1,GeometricObject o2){
        if(o1.compareTo(o2) == 1){
            return o1;
        }else return o2;
    }

}
