/*** Write a JAVA method to return a boolean true if the string doesn’t have repeating letters
 * and consecutive or nonconsecutive i.e. all the letters of the string be unique (isogram) else false.  ***/

import java.util.Scanner;

public class Task_Four_ProgramFour_IsoGramString {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String:  ");
        String str  = input.nextLine();
        input.close();

        String str1 = str.replaceAll(" ", ""); //removing space.
        boolean flag = isoGram(str1);


        /** END OF MAIN **/
    }

    public static boolean isoGram(String str)
    {
        int i,j,c=0;
        for(i =0; i < (str.length() - 1); i++)
        {
            for ( j = i + 1; j < str.length(); j++);
            {
                System.out.println("i = "+i);
                System.out.println("j = "+j);
                if(str.charAt(i) != str.charAt(j)) {
                    continue;
                }
                else
                    return false;
            }
        }
        return true;
    }
}

//error: i checked so many times, but don't know why it is going out of bound !!