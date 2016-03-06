package staticpkg;

/**
 * Created by gurpreet on 4/2/16.
 */
class Counter{
static int count=0;//will get memory only once and retain its value
   // int count=0; value not retain

        Counter(){
        count++;
        System.out.println(count);
        }

public static void main(String args[]){

        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();

        }
        }