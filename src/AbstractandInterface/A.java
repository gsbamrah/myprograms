package AbstractandInterface;

/**
 * Created by gurpreet on 10/12/15.
 */
abstract class bank {

   abstract int getInterest();
}


class  SBI extends bank
{


    int getInterest() {
        return 5;
    }
}

class  PNB extends bank
{

    int getInterest() {
        return 3;
    }

}


class D
{
    public static void main(String[] args) {
        bank obj=new SBI();
       int c =obj.getInterest();
        System.out.println(c);
    }
}