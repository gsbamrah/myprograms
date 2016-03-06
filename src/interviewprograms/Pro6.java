package interviewprograms;

/**
 * Created by gurpreet on 23/1/16.
 */

// method to remove given character from string

// why is string builder class is used
    //why is string buffer class is used
public class Pro6 {

    public static void remove(String word, char unwanted)
    {
        StringBuilder sb = new StringBuilder();
        char[] letters = word.toCharArray();
        for(char c : letters)
        {
            if(c != unwanted )
            {
                sb.append(c);
            }
        }
            //  System.out.println(sb);
            System.out.println(sb.toString());

         }
    public static String removeRecursive(String word, char ch)
    {

        int index = word.indexOf(ch);
        System.out.println(index);
        if(index == -1)
        {
          return word;
        }

              return       removeRecursive(word.substring(0, index) + word.substring(index + 1, word.length()), ch);

    }

    public static void main(String[] args)
        {
            Pro6 obj=new Pro6();

            obj.remove("gurpreet",'t');
        //    obj.removeRecursive("gurpreet",'t');

        }



}
