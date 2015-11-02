
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramli8368
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a Scanner
        Scanner in = new Scanner(System.in);
        
       int First;
       int Second;
       int Third;
       int Fourth;
        
        //Ask the user to give four numbers
        System.out.println("Please enter in 4 numbers on separate lines");
        
        First = in.nextInt();
        Second = in.nextInt();
        Third = in.nextInt();
        Fourth = in.nextInt();
        //Tell the users numbers they entered
        System.out.println("Your numbers were " + First + Second + Third + Fourth);
        
    }
}
