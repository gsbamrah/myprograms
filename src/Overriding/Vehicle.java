package Overriding;

/**
 * Created by gurpreet on 4/2/16.
 */

/*Method overriding is used to provide specific implementation of a method that is already provided by its super class.
Method overriding is used for runtime polymorphism
*/

    // super keyword preventing overiding


class Vehicle{

    void run()
    {System.out.println("Vehicle is running");}
}
class Bike extends Vehicle{

    void run()
    {System.out.println("Vehicle is running safely");
        super.run();

    }



    public static void main(String args[]){
        Bike obj = new Bike();
        obj.run();



    }
}


