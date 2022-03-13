package LAB_4;

/**
 * User class constructs the individual objects for the Lab and Project class
 *
 * @author Manvir
 * @version 09/10/17
 */

public class User {
    
    public static void main(String[] args) {
        
        AssignmentList list = new AssignmentList();
        Assignment A1 = new Assignment("ASSIGNMENT 1 : ", 11, 11, 11, 11);
        Assignment A2 = new Assignment("ASSIGNMENT 2 : ", 11, 11, 11, 11);
        Assignment L1 = new Lab("UnitTesting.pdf", "LAB 1 : ", 11, 11, 11, 11);
        Assignment L2 = new Lab("UnitTesting.pdf", "LAB 2 : ", 11, 11, 11, 11);
        Assignment P1 = new Project("Snacks.csv", "UnitTesting.pdf", "PROJECT 1 : ", 11, 11, 11, 11);
        Assignment P2 = new Project("Snacks.csv", "UnitTesting.pdf", "PROJECT 2 : ", 11, 11, 11, 11);
        
        A1.setScore(2.5);
        A1.setTotalPoint(1);
        A1.setTotalWeight(3);
        
        A2.setScore(3.5);
        A2.setTotalPoint(1);
        A2.setTotalWeight(3);
        
        L1.setScore(3.5);
        L1.setTotalPoint(1);
        L1.setTotalWeight(1);
        
        L2.setScore(3);
        L2.setTotalPoint(1);
        L2.setTotalWeight(1);
        
        P1.setScore(4);
        P1.setTotalPoint(1);
        P1.setTotalWeight(6);
        
        P2.setScore(4);
        P2.setTotalPoint(1);
        P2.setTotalWeight(6);
        
        list.addItem(A1);
        list.addItem(A2);
          
        list.addItem(L1);
        list.addItem(L2);
             
        list.addItem(P1);
        list.addItem(P2);
   
      

        System.out.println(A1);
        System.out.println(A2);
        System.out.println(L1);
        System.out.println(P1);
        System.out.println(P2);
       

        System.out.println(list);
        System.out.println("Grade : " + list.computeCourseGrade());
        
    }
}
