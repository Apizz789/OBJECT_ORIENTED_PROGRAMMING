package LAB_1;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Apirak Oulis
 */
public class Account {

    private int id;
    private double balance;
    private double anIntRate;
    private Date day = new Date();

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnIntRate() {
        return anIntRate/100;
    }

    public void setAnIntRate(double anIntRate) {
        this.anIntRate = anIntRate;
    }

    public Date getDay() {
        return day;
    }

    public void setDay(Date day) {
        this.day = day;
    }
    public double withdraw(double W){
        return balance-=W;
    }
    public double deposit(double D){
        return balance+=D;
    }
    public double MonthlyInterest(){
        return anIntRate/12;
    }
    public double getMonthlyInterest(){
        return balance*MonthlyInterest();
    }
}
