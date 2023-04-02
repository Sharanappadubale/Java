package JavaAssignment5;

import java.io.File;

public class GetFileInformation {

    public static void main(String[] args)
    {
        File myFile=new File("data1.txt");

        if(myFile.exists())
        {
            System.out.println("File name: "+myFile.getName());
            System.out.println("File location: "+myFile.getAbsoluteFile());
            System.out.println("File writable: "+myFile.canWrite());
            System.out.println("File readable: "+myFile.canRead());
            System.out.println("File Size: "+myFile.length());
        }

        else {
            System.out.println("File does not exists...");
        }
    }
}
