package Assignment2;

public class StringExample {

    public static void main(String[] args)
    {
        String str="sndkSNDK";
        boolean result = str.matches("[a-zA-Z]+");
        System.out.println("Original string:"+str);
        System.out.println("String contains only alphabets:"+result);
    }
}
