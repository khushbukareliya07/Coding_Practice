/* Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
Otherwise, print "positive" or "negative".
Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.*/


import java.util.Scanner;

public class ProgramSeven_AbsoluteValues {

    public static void main(String[] args) {

        float a;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a float value.");
        a = obj.nextFloat();

        if(a == 0.0) {
            System.out.println("Zero.");
        }

        else if(a > 0) {
            if(a < 1)
                System.out.println("small positive number.");
            else if(a > 1000000)
                System.out.println("large positive number.");
            else
                System.out.println("positive number.");
        }

        else if(a < 0)
        {
            if(Math.abs(a) < 1)
                System.out.println("small negative number.");
            else if(Math.abs(a) > 1000000)
                System.out.println("large negative number");
            else
                System.out.println("negative number");
        }
        else
        {
            System.out.println("Enter Valid number!");
        }


    }
}

