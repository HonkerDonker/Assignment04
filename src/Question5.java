
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramli8368
 */
public class Question5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create a Scanner for input
        Scanner input = new Scanner(System.in);
        
        int first;
        int second;
        int third;
        int fourth;
        int fifth;
        int sixth;
        int seventh;
        int eighth;
        int ninth;
        int tenth; 
        
        //Get the users name
        System.out.println("Please enter your name");
        String name = input.nextLine();
        
        //Ask the user for his/her tests results
        System.out.println("What was the first test out of?");        
        first = input.nextInt();
        System.out.println("What mark did you get?");
        second = input.nextInt();
        
        System.out.println("What was the second test out of?");
        third = input.nextInt();
        System.out.println("What mark did you get?");
        fourth = input.nextInt();
        
        System.out.println("What was the third test out of?");
        fifth = input.nextInt();
        System.out.println("What mark did you get?");
        sixth = input.nextInt();
        
        System.out.println("What was the fourth test out of?");
        seventh = input.nextInt();
        System.out.println("What mark did you get?");
        eighth = input.nextInt();
        
        System.out.println("What was the fifth test out of?");
        ninth = input.nextInt();
        System.out.println("Whar mark did you get?");
        tenth = input.nextInt();
        
        double answer1 = first / second;
        answer1 = Math.round(answer1*100)/100;
        double answer2 = third / fourth * 100;
        answer2 = Math.round(answer2*100)/100;
        double answer3 = fifth / sixth * 100;
        answer3 = Math.round(answer3*100)/100;
        double answer4 = seventh / eighth * 100;
        answer4 = Math.round(answer4*100)/100;
        double answer5 = ninth / tenth * 100;
        answer5 = Math.round(answer5*100)/100;
        
        System.out.println("Test Scores for " + name );
        input.nextLine();
        
         
        System.out.println("Test 1: " + answer1 );
        System.out.println("Test 2: " + answer2);
        System.out.println("Test 3: " + answer3);
        System.out.println("Test 4: " +answer4);
        System.out.println("Test 5: " +answer5);
    }
}
