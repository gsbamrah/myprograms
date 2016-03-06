package Threads;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

/**
 * Created by gurpreet on 31/1/16.
 */
public class MultipleWritingFiles implements Runnable {

    private static final String file_separator = "|";

    ArrayList<String> ls = new ArrayList();



    public static void main(String[] args) {
        MultipleWritingFiles ml = new MultipleWritingFiles();

        Thread GenerateNamethread = new Thread(ml,"RandomNameThread");
        GenerateNamethread.start();

        Thread GenerateNumberthread = new Thread(ml,"RandomNumberThread");
        GenerateNumberthread.start();

        Thread WritingFilethread = new Thread(ml,"FileWritingThread");
        WritingFilethread.start();

    }


    public void run() {

        for (int i=1;i<13;i++)
        {

          ls.add(this.GenerateName() + file_separator + this.GenerateRandomNumber()+System.lineSeparator());

         // ListIterator<String> itr=ls.listIterator();
          //while(itr.hasNext()){
            //  System.out.println(itr.next());
           // }

            try {
                this.Writingfile();
            } catch (IOException e) {
                e.printStackTrace();
            }


        }

    }


    public String GenerateName() {

        String str = "188";

        Random random = new Random();


        return String.valueOf(str + random.nextInt(999));
    }


    public String GenerateRandomNumber() {
        int a = Integer.parseInt("2908");

        Random random = new Random();

        return String.valueOf(a + random.nextInt(4566));
    }

    public void Writingfile() throws IOException

    {
        File file = new File("myfile.txt");

        if (!file.exists()) {

            file.createNewFile();


            FileWriter fw=new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw=new BufferedWriter(fw);
            ListIterator<String> itr=ls.listIterator();
            while(itr.hasNext()) {
                bw.write((itr.next()));
            }
            bw.close();

        }
    }
}