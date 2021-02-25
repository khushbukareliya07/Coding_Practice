/*** Write a JAVA method to return a boolean true if the string doesn’t have repeating letters
 * and consecutive or nonconsecutive i.e. all the letters of the string be unique (isogram) else false.  ***/

import java.util.Arrays;
import java.util.Scanner;

public class Four_IsoGramString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String:  ");
        String str  = input.nextLine();
        input.close();

        String str1 = str.replaceAll(" ", "").toLowerCase(); //removing space.
        System.out.println("entered string is : "+str1);
        boolean flag = isoGram(str1);
        if(flag)
            System.out.println("String is Isogram");
        else
            System.out.println("String is not Isogram.");

        /** END OF MAIN **/
    }

    public static boolean isoGram(String str)
    {
        if(str == " ")
            return false;

        char [] arr = str.toCharArray();
        Arrays.sort(arr);

        for(int i = 0; i < arr.length -1 ; i++)
        {
            if(arr[i] == arr[i+1]) {
                  return false;
            }
        }

        return true;
    }
}


// error: Works for all the case except, when I just enter consecutive space as a string, returns true, though i put condtion to check null string!