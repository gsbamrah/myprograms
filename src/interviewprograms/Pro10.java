package interviewprograms;

/**
 * Created by gurpreetsingh on 2/22/2016.
 *
 * bring all spaces ifnfront of string
 */
public class Pro10 {

    public static void main(String[] args) {


        String str = "gurpreet singh  is   my    name";
        char arr[] = str.toCharArray();
        StringBuilder builder=new StringBuilder();
        StringBuilder  builder1=new StringBuilder();
        for (char v : arr) {
            if(v== ' '  )
                builder.append(v);
            else if(v!=' ')
                builder1.append(v);

        }
        System.out.println(builder.append(builder1.toString()));




    }
}