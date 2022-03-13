package LAB_1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Apirak Oulis
 */
public class MAIN {
    public static void main(String[] args) {
        Account A1 = new Account(1122,20000);
        A1.setAnIntRate(4.5);
        A1.withdraw(1550);
        A1.deposit(4500);
        System.out.println("NAME ID : "+A1.getId()+"\n"+"BALANCE : "+A1.getBalance()+"\n"+"INS RATE : "+A1.getAnIntRate()+"\n"+A1.getDay());
    }
}
