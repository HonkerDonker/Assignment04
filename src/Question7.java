
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramli8368
 */
public class Question7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int first;
        int second;
        int third = 100;
        int fourth = 270;
        int fifth = 500;
        
        System.out.println("Enter the speed limit");
        first = input.nextInt();
        
        System.out.println("Enter the recorded speed of the car");
        second = input.nextInt();
        
        if(second < first){
            System.out.println("Congratulations, you are within the speed limit!");
        }
        if(second > first){
            
                   
            System.out.println(".");
        }    
    }
}
