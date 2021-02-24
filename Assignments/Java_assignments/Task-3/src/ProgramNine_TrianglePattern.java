import java.util.Scanner;

public class ProgramNine_TrianglePattern {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of Rows > 1:  ");
        int row = input.nextInt();

        if(row < 1)
            System.out.println("Enter Valid row data greater than 1.");

        else
        {
            for(int i =1; i <= row; i++)
            {
                for(int j = 1; j <= i; j++)
                {
                    System.out.print(j);
                }
                System.out.println();
            }
        }
    }
}
