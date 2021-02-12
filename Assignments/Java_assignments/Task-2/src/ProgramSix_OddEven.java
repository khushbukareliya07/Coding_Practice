import java.util.Scanner;

public class ProgramSix_OddEven {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int a;

        System.out.println("Enter a number : ");
        a = obj.nextInt();

        if(a <= 0)
            System.out.println("You have entered ZERO or NEGATIVE Number!");

        else
        {
            if( a%2 !=0)
                System.out.println("NEW");
            else
            {
                if(a >=2 && a<5)
                {
                    System.out.println("OLD");
                }
                else if(a >=6 && a<= 30)
                {
                    System.out.println("NEW");
                }
                else
                    System.out.println("OLD");
            }
        }

    }
}
