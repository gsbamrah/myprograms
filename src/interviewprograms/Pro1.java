package interviewprograms;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Created by gurpreet on 14/12/15.
 */
// Duplicate number between 1 to N
public class Pro1 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int number=sc.nextInt();
        int[] arr = new int[number];
        System.out.println("Enters the numbers");

        for ( int i=0; i<arr.length;i++) {

            arr[i]=sc.nextInt();
        }
        for ( int i=0; i<arr.length;i++) {
            System.out.println("numbers you have entered are "+arr[i]);

        }

        for ( int i=0; i<arr.length-1;i++) {
            Arrays.sort(arr);
            if (arr[i]==arr[i+1])
                System.out.println("Duplicates number are "+arr[i]);
        }

    }




}
