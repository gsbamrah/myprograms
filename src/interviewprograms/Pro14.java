package interviewprograms;

/**
 * Created by gurpreetsingh on 2/27/2016.
 *
 * In a array of String sum of two number is equal to given number
 */
public class Pro14 {

    public static void main(String[] args) {
        Pro14 obj=new Pro14();

        obj.SumequaltoSeven();
    }


    public void SumequaltoSeven() {
        int arr[] = {4, 3, 5, 1, 6, 5, 2};
        int number = 7;
        for (int i=1;i<arr.length;i++) {
            int result = arr[i - 1] + arr[i];
            if (result == number) {
                System.out.println("pair are " + arr[i] + "," + arr[i - 1]);

            }
        }


    }
}