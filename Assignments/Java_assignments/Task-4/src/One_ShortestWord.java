/* Write a JAVA program that takes given String of words and return the length of the shortest word. */

import java.util.Scanner;

public class One_ShortestWord {
    public static void main(String[] args) {

        Scanner input   = new Scanner(System.in);
        System.out.println("Enter a String.");
        String str = input.nextLine();
        int length = str.length();

        String strWord[] = str.split(" "); // My Name is Khushbu

        for(int i =0; i< strWord.length; i++)
        {
            length = Math.min(strWord[i].length(), length );
        }

        System.out.println("Shortest word length : "+length);




    }
}
