package Assignment3;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindFile {



    public static void printAbsolutePath(File file, Pattern pattern){
        //Returns an array of Files denoting the files in a given pathname
        File[] fileList =file.listFiles();
        for(File fileName : fileList)
        {
            //Checking whether the input file name is directory or not
            if(fileName.isDirectory()) {
                //Recursive call
                printAbsolutePath(fileName, pattern);
            }
            else{
                //Performs match operations on a character sequence by interpreting a Pattern.
                Matcher matcher = pattern.matcher(fileName.getName());
                //Find the next subsequence of the input sequence
                if(matcher.find())
                    //Printing the Absolute path
                    System.out.println("Path : " + fileName.getAbsolutePath());
            }
        }

    }
    public static void main(String[] args)
    {
        //File object is created by passing the path
        File myFile=new File("/home/shad/Documents");
        while(true){
            //Scanner object is created

            System.out.println("---- Enter File Name --- Press 1 to exit program ----\t");
            Scanner input = new Scanner(System.in);
            //File name given as input
            String inputFileName=input.nextLine();
            //If the given input is 1 then exit program
            if(inputFileName.equals("1")){
                //Breaks while loop
                return;
            }
            //Creating pattern with given input
            Pattern pattern = Pattern.compile(inputFileName, Pattern.CASE_INSENSITIVE);
            printAbsolutePath(myFile,pattern);
        }//ends while
    }


}
