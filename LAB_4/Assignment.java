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

public class Assignment {
    private String name;
    private int month,day,hour,minute;
    private double score;
    private double TotalPoint,TotalWeight;

    public Assignment() {
    }

    public Assignment(String name, int month, int day, int hour, int minute) {
        this.name = name;
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
    }

    public String getName() {
        return name;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    
    public double getTotalPoint() {
        return TotalPoint;
    }

    public double getTotalWeight() {
        return TotalWeight;
    }

    public void setTotalPoint(double TotalPoint) {
        this.TotalPoint = TotalPoint;
    }

    public void setTotalWeight(double TotalWeight) {
        this.TotalWeight = TotalWeight;
    }

    @Override
    public String toString() {
        return  name +"("+ "date : " + month + "-" + day + "at" + hour + ":" + minute + ")"
                + ":"+"score = "+ score + "; totalPoints = " + TotalPoint+ "; totalWeight = "+ TotalWeight;  
                
    }
    // U n i t T e s t i n g ( d a t e : 12−01 a t 2 3 : 0 0 ) : s c o r e = 0 . 7 8 ; t o t a l P o i n t s = 0 . 9 9 ; t o t a l W e i g h t = 0 . 3 0
  //  String.format("asdfasdfasdf %d asdf %s",asdf,sd)
    
}
