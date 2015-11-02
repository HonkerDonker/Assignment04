
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ramli8368
 */
public class Question6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int first;
        int second;
        int third;
        
        System.out.println("Number of daytime minutes?");
        first = input.nextInt();
        
        System.out.println("Number of evening minutes?");
        second = input.nextInt();
        
        System.out.println("Number of weekend minutes?");
        third = input.nextInt();
        
        //Plan A
        double answer1 = first - 100 * 0.25;
        double answer2 = second * 0.15;
        double answer3 = third * 0.20;
        
        //Plan B
        double answer4 = first - 250 * 0.45;
        double answer5 = second * 0.35;
        double answer6 = third * 0.25;
        
        System.out.println("Plan A costs: " + answer1 + answer2 + answer3);
        
        System.out.println("Plan B costs: " + answer4 + answer5 + answer6);
        
        
    }
}
