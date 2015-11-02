
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramli8368
 */
public class Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        int first;
        int second;
        int third;
        int fourth;
        int fifth;
        int sixth;
        
        
        System.out.println("How much does the food for prom cost?");
        first = input.nextInt();
        
        System.out.println("How much does the DJ cost?");
        second = input.nextInt();
        
        System.out.println("How much does it cost to rent the hall?");   
        third = input.nextInt();
        
        System.out.println("How much does decorations cost?");
        fourth = input.nextInt();
                
        System.out.println("How much does it cost for staff?");
        fifth = input.nextInt();
        
        System.out.println("How much for miscellaneous costs?");
        sixth = input.nextInt();
        
        int answer = input.nextInt();
        answer = first + second + third + fourth + fifth + sixth;
        
        System.out.println("");
    }
}
