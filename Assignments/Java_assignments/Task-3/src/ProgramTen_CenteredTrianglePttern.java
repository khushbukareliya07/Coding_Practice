import java.util.Scanner;
public class ProgramTen_CenteredTrianglePttern {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of Rows > 1:  ");
        int row = input.nextInt();


        if (row < 1)
            System.out.println("Enter Valid row data greater than 1.");

        else {
            int c =1;
            for (int i = 0; i < row; i++) {

                for(int space = row -i -1 ; space > 0; space--)
                {
                    System.out.print(" ");
                }

                for (int j = 0; j <= i; j++) {
                    if(i ==0 || j ==0)
                        c = 1;
                    else
                        c = c * (i-j +1) / j;

                    System.out.print(c + " ");
                }
                System.out.println();
            }
        }
    }
}