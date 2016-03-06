package anonymousclass;

/**
 * Created by gurpreet on 3/2/16.
 */


/*


A class that have no name is known as anonymous inner class in java.
It should be used if you have to override method of class or interface. Java Anonymous inner class can be created by two ways:

Class (may be abstract or concrete).
Interface
 */
abstract class Result{
    abstract void display();
}
class TestInnerClass{
    public static void main(String args[]){
        Result p=new Result()
        {

            void display()
            {System.out.println("gurpreet");
            }
        };
        p.display();
    }
}

/*

interface Eatable{
    void eat();
}
class TestAnnonymousInner1{
    public static void main(String args[]){
        Eatable e=new Eatable(){
            public void eat(){System.out.println("nice fruits");}
        };
        e.eat();
    }
}
*/