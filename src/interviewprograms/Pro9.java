package interviewprograms;

import java.util.Scanner;
/**
 * Created by gurpreet on 4/2/16.
 */
public class Pro9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        Pro9 obj=new Pro9();
       int c= obj.recurnfunc(number);

        System.out.println(c);
        System.out.println("Enter the number");

    }

    public int recurnfunc(int number)
    {
        int fact=1;


        fact=fact+recurnfunc(number-1);

      return fact;
    }}

