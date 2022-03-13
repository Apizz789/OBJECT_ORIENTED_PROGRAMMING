/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LAB_4;

/**
 *
 * @author Apirak Oulis
 */
public class Lab extends Assignment{
    private String Spec;
    public Lab() {
    }
    public Lab(String Spec, String name, int month, int day, int hour, int minute) {
        super(name, month, day, hour, minute);
        this.Spec = Spec;
    }

    @Override
    public String toString() {
        return getName() +"("+ "date : " + getMonth() + "-" + getDay() + "at" + getHour() + ":" + getMinute() + ")"
                + ":"+"score = "+ getScore() + "; totalPoints = "+ getTotalPoint()+ "; totalWeight = "+getTotalWeight()
                +" specification = "+Spec;  
    }
    
}
