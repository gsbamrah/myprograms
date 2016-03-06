package interviewprograms;

import java.util.Scanner;

/**
 * Created by gurpreetsingh on 3/6/2016.
 * Normal search
 */
public class Pro17 {

    public static void main(String[] args) {

        Pro17 obj = new Pro17();
        obj.takeInput();
    }

    public void takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Array Size");
        int number = sc.nextInt();
        int arr[] = new int[number];
        System.out.println("Enter The Numbers");
        for (int i = 0; i < number; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Numbers Entered Are");
        for (int i = 0; i < number; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Enter The Number Want to Search");
        int search = sc.nextInt();
        for (int i = 0; i < number; i++) {
            if (arr[i] == search) {
                System.out.println("Number Exist");
            }

        }
    }
}