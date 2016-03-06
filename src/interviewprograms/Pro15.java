package interviewprograms;

/**
 * Created by gurpreetsingh on 2/27/2016.
 */
public class Pro15 {

    public static void main(String[] args) {
        Pro15 obj=new Pro15();
       // obj.reverseNumberMethod1();
        obj.revereseNumberMethod2();
    }
        public void reverseNumberMethod1() {
        int number=1234;

            String str= String.valueOf(number);
            StringBuilder build=new StringBuilder(str);
            System.out.println("number is=>"+Integer.parseInt(build.reverse().toString()));




        }


    public void revereseNumberMethod2(){

        int number=1234;
        int reverse=0;
        while (number!=0) {
            reverse = reverse * 10;
            reverse = reverse + number % 10;
            number = number / 10;

        }
        System.out.println(reverse);
    }
}
