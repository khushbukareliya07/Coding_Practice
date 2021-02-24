import java.util.Scanner;

public class ProgramSix_IncreasingDecreasing {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int i = 0;
        char numberArr [] = String.valueOf(n).toCharArray();

        for(int j =0; j < numberArr.length - 1; j++)
        {
            if(numberArr[j] > numberArr[j+1])
            {
                continue;
            }
        }


    }
}
