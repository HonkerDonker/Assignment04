
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramli8368
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Create a Scanner for input
        Scanner input = new Scanner(System.in);
        
        //Get the users name
        System.out.println("Please Enter Your Name");        
        String name = input.nextLine();
        
        //say hello
        System.out.println("Hello " + name + ". How are you?");
        
    }
}
