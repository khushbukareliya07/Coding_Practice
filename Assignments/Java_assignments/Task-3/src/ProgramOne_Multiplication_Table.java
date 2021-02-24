import java.util.Scanner;

public class ProgramOne_Multiplication_Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Number to get Table.");
        int a  =  input.nextInt();
        System.out.println("***** Table of " + a + " *****");
        for(int i = 1; i<=10; i++ )
        {
            System.out.println(a + " * " + i + " = " + (a*i));
        }
    }
}
