package interviewprograms;

/**
 * Created by gurpreet on 26/12/15.
 */


// play with String

public class Pro4 {


    public static void main(String[] args) {

        String str = "Gurpreet";
        String str2 = "Singh";
        String str12="";
        String str13="testing.com";

        // concat method used to join two string
        String str3 = str.concat(str2);
        System.out.println(str3);

        // charAt method use
        char ch = str.charAt(0);

        System.out.println(ch);

        //printing string with the characters
        for (int i = 0; i < str.length(); i++) {
            char chjoin = str.charAt(i);
            System.out.print(chjoin);
        }

      /*use of toString method

        Returns a string representation of the object. In general, t
        he toString method returns a string that "textually represents" this object. T
        he result should be a concise but informative representation that is easy for a person to read.
         It is recommended that all subclasses override this method.
       eg:  logging and debugging.
       The main use of toString() is allowing arbitrary objects to be printed or logged.
*/


        String str7 = str.toString();
        System.out.println(str7);


        // use of compareTo methods


        /*The method compareTo() is used for comparing two strings lexicographically.
        Each character of both the strings is converted into a Unicode value for comparison.
        If both the strings are equal then this method returns 0 else it returns positive or negative value.
        The result is positive if the first string is lexicographically greater than the second string
        else the result would be negative.
         */

        int diff = str2.compareTo(str);
        System.out.println(diff);

        // two String equals
        if (str7.equals(str))
            System.out.println("yes they are same");

        // contains method
        if (str.contains("Gur"))
            System.out.println("yes it contains");

         // ends with Suffix
        if(str.endsWith("eet"))
            System.out.println("yes it end ");

        // equal or
        String str9="gurpreet";
        String str10="GURPREET";

        if (str9.equalsIgnoreCase(str10))
            System.out.println("yes they are equal");

        if(str9.equals(str10))

            System.out.println("equal does not work");

        System.out.println(str.getBytes());

         // isEmpty method in java

        if (str12.isEmpty())
        System.out.println("yes string is empty");

        // string length
        System.out.println("string length is "+str.length());

        // replace method
        System.out.println(str.replace('G', 's'));

    //regex -- the regular expression to which this string is to be matched.

     //   replacement -- the string which would replace found expression.

        // replace all method

        System.out.println(str13.replaceAll(".com", ".net"));



      // split method in java
        // The java string split() method splits this string against given regular expression and returns a string array.
      /*
        public String split(String regex)
        and,
        public String split(String regex, int limit)
        */

        String path="My_Home_Page=id=firstname";

          String LocaterDetail[]=path.split("=", 3);
            System.out.println(LocaterDetail[0]);
            System.out.println(LocaterDetail[1]);
            System.out.println(LocaterDetail[2]);

            // substring- extracting string on the basis of index

           //beginIndex -- the begin index, inclusive.

           //     endIndex -- the end index, exclusive.
        System.out.println(str.substring(5));

        System.out.println(str.substring(3, 5));

        System.out.println(str.substring(0, 7));


    }
}
