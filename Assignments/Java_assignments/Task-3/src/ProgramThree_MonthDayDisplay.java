import java.util.Scanner;

public class ProgramThree_MonthDayDisplay {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int days = 30;
        System.out.println("Enter a Month : ");
        int month = input.nextInt();
        if(month >12 || month <1 )
        {
            System.out.println("Invalid Details.");
        }
        else
        {
            if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            {
                System.out.println("Number of Days =" + (days+1));
            }
            else if (month == 2)
            {
                System.out.println("For leap year, number of Days =" + (days - 1));
                System.out.println("For leap year, number of Days =" + (days - 2));
            }
            else
                System.out.println("Number of Days =" + (days));
        }
    }
}
