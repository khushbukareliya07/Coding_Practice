import java.util.Scanner;

public class ProgramFour_ContinueBreak {

    public static void main(String[] args) {
        int a ;
        Scanner obj =  new Scanner(System.in);

        do
        {
            System.out.println("\n\nEnter number:");
            a = obj.nextInt();
            obj.nextLine();

            if(a>0)
                System.out.println("Going Good.");
            else
            {
                System.out.println("It's Over.");
                break;
            }

        }while(true);
    }
}
