package JavaAssignment5;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args)
    {
        String data="This is the WriteFile class";

        FileWriter fw= null;
        try {
            fw = new FileWriter("data1.txt");

            fw.write(data);
            System.out.println("Data is written successfully");
            fw.close();
        } catch (IOException e) {
            System.out.println("File write error...");
        }

    }
}
