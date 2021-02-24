import java.util.Scanner;

public class ProgramFour_SumOfnNumber {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n =  input.nextInt();
        if(n<=0)
            System.out.println("Enter valid natural number. ");

        else
        {
            for(int i = 1; i<=n ; i++)
            {
                sum += i;
                System.out.println("number: " +i);
            }
            System.out.println("Sum till number " + n + " is: " +sum);
        }
    }
}
