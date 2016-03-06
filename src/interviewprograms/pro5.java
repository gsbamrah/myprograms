package interviewprograms;
import java.io.*;

/**
 * Created by gurpreet on 26/12/15.
 *
 * The getBytes() method encodes a given String into a sequence of bytes and returns an array of bytes. The method can be used in below two ways:

 public byte[] getBytes(String charsetName): It encodes the String into sequence of bytes using the specified charset and return the array of those bytes. It throws UnsupportedEncodingException – If the specified charset is not supported.
 public byte[] getBytes(): It encodes the String using default charset method.
 */
public class pro5 {
    public static void main(String args[]) {
        String str = new String("Hello");
        byte[] array1 = str.getBytes();
        System.out.print("Default Charset encoding:");
        for (byte b : array1) {
            System.out.print(b);
        }
        System.out.print("\nUTF-16 Charset encoding:");
        try {
            byte[] array2 = str.getBytes("UTF-16");
            for (byte b1 : array2) {
                System.out.print(b1);
            }
            byte[] array3 = str.getBytes("UTF-16BE");
            System.out.print("\nUTF-16BE Charset encoding:");
            for (byte b2 : array3) {
                System.out.print(b2);
            }
        } catch (UnsupportedEncodingException ex) {
            System.out.println("Unsupported character set" + ex);
        }
    }

}
