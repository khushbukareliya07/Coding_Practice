import java.util.Scanner;

public class ProgramEleven_FloatingPoint {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st floating point number. ");
        double n1  =  input.nextDouble();
        System.out.println("Enter 2nd floating point number. ");
        double n2  =  input.nextDouble();
        input.close();

        if(Math.abs(n1 - n2) <= 0.01)
            System.out.println("Same Numbers");
        else
            System.out.println("Different Numbers");


        System.out.println(Math.abs(n1));
    }

}
