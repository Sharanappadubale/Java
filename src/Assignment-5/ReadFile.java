package JavaAssignment5;

import java.io.*;

public class ReadFile {

    public static void main(String[] args)
    {
        // File path is passed as parameter
        File myFile=new File("data1.txt");

        FileReader read= null;
        try {
            read = new FileReader(myFile);

            // Creating an object of BufferedReader class
            BufferedReader br=new BufferedReader(read);
            // Declaring a string variable
            String st= br.readLine();
            // Condition holds true till
            // there is character in a string
         while ((st!=null))
          {
              System.out.println(st);
              break;
          }
          br.close();
        } catch (IOException e) {
            System.out.println("File read error...");
        }


    }
}
