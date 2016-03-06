package interviewprograms;

import java.util.Scanner;

/**
 * Created by gurpreet on 5/2/16.
 */
public class BubbleSort {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("Enter how many number you want to sort");
        int number=sc.nextInt();
        int temp=0;




        int arr[]=new int[number];


        for( int i=0;i<number;i++)

        {
            arr[i] = sc.nextInt();

        }

        for (int i=0; i<number;i++)
        {
            System.out.println("Number in Array are"+arr[i]);
        }


      for (int i=0;i<number-1;i++)
      {
          for (int j=0;j<number-i-1;j++)
          {
              if (arr[j]>arr[j+1])

              {
              temp     = arr[j];
              arr[j]   = arr[j+1];
              arr[j+1] = temp;

          }
      }}

for (int i=0;i<number;i++) {
    System.out.println(arr[i]);


}


    }
}
