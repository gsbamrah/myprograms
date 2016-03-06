package interviewprograms;

import java.util.HashSet;

/**
 * Created by gurpreetsingh on 2/22/2016.
 *
 * Longest SubString Without repeating character
 */
public class Pro12 {

    public static void main(String[] args) {
        Pro12 obj=new Pro12();
        String str=obj.LongestSubString("gurpreet");
        System.out.println("The Longest SubString is "+str+" and its Length is "+str.length());

    }


    private static String LongestSubString(String word)
    {
        char[] charArray = word.toCharArray();
        HashSet set = new HashSet();
        String longestOverAll = "";
        String longestTillNow = "";
        for (int i = 0; i < charArray.length; i++) {
            Character c = charArray[i];

            if (set.contains(c)) {
                longestTillNow = "";
                set.clear();
            }
            longestTillNow += c;
            set.add(c);
            if (longestTillNow.length() > longestOverAll.length())
            {
                longestOverAll = longestTillNow;

            }
        }

        return longestOverAll;
    }
}
