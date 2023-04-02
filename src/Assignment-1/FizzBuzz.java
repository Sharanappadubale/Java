package JavaAssignment1;

public class FizzBuzz {

    public static void main(String[] args)
    {
       // loop for 100 times
        int num=100;

        for(int i=1; i<=num; i++)
        {
            //Number is divisible by 3 print 'Fizz' instead of number
            if(i%3==0)
            {
                System.out.println("Fizz");
            }

            //Number is divisible by 5 print 'Buzz' instead of number
            else if (i%5==0)
            {
                System.out.println("Buzz");
            }

            //Number is divisible by 15 or both 3 & 5 print 'FizzBuzz' instead of number
            else if (i%15==0)
            {
                System.out.println("Buzz");
            }
             // Only print the numbers
            else {
                System.out.println(i);
            }
        }


    }



}
