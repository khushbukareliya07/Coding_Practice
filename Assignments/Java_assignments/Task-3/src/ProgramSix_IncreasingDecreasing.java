import java.util.Scanner;

public class ProgramSix_IncreasingDecreasing {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter First Number");
        int n1 = obj.nextInt();
        System.out.println("Enter Second Number");
        int n2 = obj.nextInt();
        System.out.println("Enter Third Number");
        int n3 = obj.nextInt();

        if(n1> n2)
        {
            if(n2>n3)
            {
                System.out.println("DECREASING");
            }
            else
            {
                System.out.println("Neither increasing nor decreasing order.");
            }

        }
        else    //n1< n2
        {
            if(n2 < n3)
            {
                System.out.println("INCREASING");
            }
            else
            {
                System.out.println("Neither increasing nor decreasing order.");
            }

        }





    }
}
