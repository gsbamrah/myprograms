package interviewprograms;

/**
 * Created by gurpreet on 14/12/15.
 */

// reversing a string using recursive algorithm
// string is palindrome or not


    public class Pro3 {

        String reverse = "";

        public String reverseString(String str){

            if(str.length() == 1){
                return str;
            } else {

                reverse += str.charAt(str.length()-1)
                        +reverseString(str.substring(0,str.length()-1));
                return reverse;
            }
        }

        public static void main(String a[]){
            Pro3 p1 = new Pro3();
            System.out.println("Result: "+p1.reverseString("Gurpreet"));
        }




    }

