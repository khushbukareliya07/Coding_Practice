import java.util.Scanner;

public class UserInputOperations {
    public static void main(String[] args) {
        int n1, n2, z;

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter any TWO number between 1-10");


        System.out.println("Enter the first number");
        n1 = obj.nextInt();
        System.out.println("Enter the second number");
        n2 = obj.nextInt();

        z = n1 + n2;
        z += 30;

        System.out.println("Final result is : " +z);

    }
}
