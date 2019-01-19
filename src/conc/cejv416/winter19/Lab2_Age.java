/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conc.cejv416.winter19;

/**
 *
 * @author P_ABOURA
 */
public class Lab2_Age {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int currentYear = 2019;
    final int CURRENT_AGE_YEAR = 1995;
    int age = currentYear - CURRENT_AGE_YEAR;
    int numberMonths = age * 12;
    int numberDays = age * 365;
    System.out.println("Person is " + age + "years old,");
    System.out.println("which is" + numberMonths + "months.");
    System.out.println("Which is" + numberDays + "days.");
    }
    
}
