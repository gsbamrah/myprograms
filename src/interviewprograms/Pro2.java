package interviewprograms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by gurpreet on 14/12/15.
 */

// Reverse a String using String Builder Method and chartAt method
    // string is palidrome or not
public class Pro2 {


    public static void main(String[] args) throws IOException {

        Pro2 obj=new Pro2();
       // Pro2.MethodA();
       // Pro2.MethodB();



    }
    static void MethodA() {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the String =>");
         String str = sc.next();
         System.out.println("String is =>" + str);
        StringBuilder  rev=new StringBuilder(str);
        rev.reverse().toString();
       //  String rev = new StringBuffer(str).reverse().toString();
         System.out.println("reverse string is=>" + rev);
     }


   static void MethodB() throws IOException {

       System.out.println("Enter the String");
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       String str=br.readLine();
      // System.out.println(str.length());
           for(int i=str.length();i>0;i--) {
             String str2 = String.valueOf(str.charAt(i - 1));
               System.out.print(str2);
           }




}}
