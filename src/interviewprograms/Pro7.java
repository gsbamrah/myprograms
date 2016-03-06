package interviewprograms;

/**
 * Created by gurpreet on 24/1/16.
 */

// Singleton Class

    //Singleton class means you can create only one object for the given class. You can create a singleton class by making its constructor as private,
    // so that you can restrict the creation of the object. Provide a static method to get instance of the object, wherein you can handle the object creation inside the class only.
    // In this example we are creating object by using static block
public class Pro7 {


    private static Pro7 myObj;

    static {
        myObj = new Pro7();
    }

    private Pro7() {

    }

    public static Pro7 getInstance() {
        return myObj;
    }

    public void testMe() {
        System.out.println("Hey.... it is working for me!!!");
    }

    public static void main(String a[]) {
        Pro7 ms = getInstance();
        ms.testMe();
    }

}
