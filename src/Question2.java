
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramli8368
 */
public class Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a Scanner
        Scanner input = new Scanner(System.in);
        
        //Ask them the question
        System.out.println("Please enter the measurement in inches you wish to convert");
        
        //Multiply their given number by 2.54, to get their measurment in Cm
        int number = input.nextInt();        
        double answer = number * 2.54;
        
        System.out.println( number + " is the same as " + answer );
    }
}
