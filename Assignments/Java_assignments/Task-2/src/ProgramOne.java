import java.util.Scanner;

public class ProgramOne {
    public static void main(String[] args) {
        int n1 = -999;
        Scanner obj = new Scanner(System.in);

        while (n1 < 0) {

            System.out.println("Enter a number > 0");
            n1 = obj.nextInt();
        }

        if (n1%3 == 0) {
            if (n1%5 == 0)
                System.out.println("Consultadd Java Training");
            else
                System.out.println("Consultadd");
        } else if (n1%5 == 0) {
            System.out.println("Java Training");
        } else
            System.out.println("Number you've entered is neither divisible by 3 nor by 5!");
    }
}