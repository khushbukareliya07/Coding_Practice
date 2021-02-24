import java.util.Scanner;

public class ProgramTwo_SumandAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 0, sum = 0;
        System.out.println("Enter 10 numbers one by one. ");
        for(int i = 1; i<=10; i++)
        {
            System.out.print("Enter number "+i+" : ");
            a = input.nextInt();
            sum +=a;
            input.nextLine();
        }

        System.out.println("The sum is: " +sum);
        System.out.println("The average is : "+(sum/10));
    }
}
