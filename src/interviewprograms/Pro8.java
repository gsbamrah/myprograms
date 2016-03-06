package interviewprograms;

import java.util.Scanner;

/**
 * Created by gurpreet on 4/2/16.
 */

// factorial of a given number
public class Pro8 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Enter the number");

        int fact=1;
        for (int i = number; i > 0; i--)
        {
            fact = fact * i;
        }

        System.out.println("The factorial is"+fact);



    }
}
