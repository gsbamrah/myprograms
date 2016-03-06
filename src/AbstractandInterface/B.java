package AbstractandInterface;

/**
 * Created by gurpreet on 10/12/15.
 */


interface  interf
{
    void show();
}
class B implements interf{

public void show()
{
    System.out.println("Guru");

}

    public static void main(String[] args) {
        B obj=new B();
        obj.show();
    }

}
