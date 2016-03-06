package interviewprograms;

/**
 * Created by gurpreetsingh on 2/22/2016.
 *
 * First and Second Highest Repeating Character in a String
 */
public class Pro11 {

    public static void main(String[] args) {

        Pro11 obj=new Pro11();
       // obj.MethodII("abbcdb");
        obj.MethodIII();

    }
        public void  MethodI(){

        String str = "abbcb";
        char[] array = str.toCharArray();
        int count = 1;
        int max = 0;
        char maxChar = 0;
        for(int i=1; i<array.length; i++){ // Start from 1 since we want to compare it with the char in index 0
            if(array[i]==array[i-1]){
                count++;
            } else {
                if(count>max){  // Record current run length, is it the maximum?
                    max=count;
                    maxChar=array[i-1];
                }
                count = 1; // Reset the count
            }
        }
        if(count>max){
            max=count; // This is to account for the last run
            maxChar=array[array.length-1];
        }
        System.out.println("Longest run: "+max+", for the character "+maxChar);

    }


    public void  MethodII(String str)
    {
        char[] array = str.toCharArray();
        int maxCount = 1;
        char maxChar = array[0];
        for(int i = 0, j = 0; i < str.length() - 1; i = j){
            int count = 1;
            while (++j < str.length() && array[i] == array[j]) {
                count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxChar = array[i];
            }
        }
        System.out.println(maxChar + " = " + maxCount);
    }

    public  void MethodIII()
    {
                int count1=0;
                int count2=0;
                int point=0;

                String str="aabacb";

                for (int i = 0; i < str.length(); i++) {

                    for (int j=i; j<str.length(); j++){

                        if (str.charAt(i) == str.charAt(j)){
                            count1++;
                        }
                    }

                    if(count2 >= count1){
                        count1 =0;
                    }else{
                        count2 = count1;
                        point = i;
                        count1 = 0;
                    }
                }
                System.out.println("Highest Reapting char is : "+ str.charAt(point)
                        + ", and its reapting number is : "+ count2);
            }}

