import java.util.Scanner;

/** Write a JAVA program that gives boolean values; true,
 *if the string has balanced braces and false, if the string has unbalanced braces:  **/

public class Seven_BalancedBraces {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String:  ");
        String str  = input.nextLine();
        input.close();

        if(balancedBraces(str))
        {
            System.out.println("True");
        }
        else
            System.out.println("False");
    /** End of Main **/
    }

    public static boolean balancedBraces(String str)
    {
        int openCounter = 0, closeCounter = 0, temp=0;
        char [] open = {'(', '{', '[' };
        char [] close = {')', '}', ']'};

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == open[0] || str.charAt(i) == open[1] || str.charAt(i) == open[2])
                openCounter++;

            else if(str.charAt(i)== close[0] || str.charAt(i)== close[1] || str.charAt(i)== close[2]) {
                closeCounter++;
            }
            else
                temp++;
        }
        if(temp > 0 && openCounter==0 && closeCounter==0)
            return true;
        if(openCounter !=  closeCounter )
        return false;


        return  true;
    }
}
