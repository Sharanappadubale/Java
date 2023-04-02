package JavaAssignment5;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args)
    {
        File myFile=new File("data1.txt");

        try {
            if (myFile.createNewFile())
            {
                System.out.println("File created successfully");
            }
            else {
                System.out.println("File already exists...");
            }
        } catch (IOException e) {
            System.out.println("File error handling");
        }

    }
}
