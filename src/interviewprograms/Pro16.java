package interviewprograms;

import java.util.Scanner;

/**
 * Created by gurpreetsingh on 2/28/2016.
 *
 * fibonacci series
 */
public class Pro16 {

    public static void main(String[] args) {

        Pro16 obj = new Pro16();
        obj.fibonacciSeries();

    }

    public void fibonacciSeries() {
        System.out.println("Enter the Series Number");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
       int arr[]=new int[number];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<number;i++)
        {
            arr[i]=arr[i-2]+arr[i-1];
        }

        for(int i=0;i<number;i++)
        {
            System.out.println(arr[i]);
        }

    }
}