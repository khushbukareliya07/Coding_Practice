import java.util.Scanner;

public class ProgramSeven_daysInMonth {
    public static void main(String[] args) {

        int days = 30;
        Scanner obj  =  new Scanner(System.in);

        System.out.println("Enter a month");
        int month = obj.nextInt();

        System.out.println("Enter a Year");
        int year = obj.nextInt();

        if(month > 12 || month <1 || year < 0)
        {
            System.out.println("Enter valid data.");
        }
        else
        {
            if(month == 2)
            {
                if(year % 400 == 0)
                {
                    System.out.println("February " + year+ " has 29 days.");
                }

                else if(year % 4 == 0)
                {
                    if(year % 100 == 0) // Not a leap year
                        System.out.println("February " + year+ " has 28 days.");
                    else
                        System.out.println("February " + year+ " has 29 days.");
                }

                else
                {
                    System.out.println("Enter a valid data for year!");
                }
            }

            else if(month == 1 || month == 3 ||  month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            {
                System.out.println("Month : "+month+ " has " +(days+1) +" days.");
            }

            else
            {
                System.out.println("Month : "+month+ " has " +(days) +" days.");
            }
        }
    }
}
