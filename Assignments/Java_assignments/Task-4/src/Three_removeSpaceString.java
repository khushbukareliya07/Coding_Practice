/*** Write a JAVA method to remove all the spaces from the String and return the resultant.  ***/
import java.util.Scanner;

public class Three_removeSpaceString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String:  ");
        String str  = input.nextLine();
        input.close();

        String str1 = str.replaceAll(" ", "");
        System.out.println("Final String: "+str1);
    }
}
