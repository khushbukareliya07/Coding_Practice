import java.util.Scanner;

import static java.lang.Character.isLowerCase;

public class Six_SwapingAlphabatesCase {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String:  ");
        String str  = input.nextLine();
        input.close();

        System.out.println("New String: " +changeTheCase(str));

        /** End of Main **/
    }

    public static String changeTheCase(String str)
    {   char [] stringArr = str.toCharArray();
        for(int i = 0; i< stringArr.length; i++)
        {
            if(isLowerCase(stringArr[i])) {
                stringArr[i] = Character.toUpperCase(stringArr[i]);
            }
            else
            {
                stringArr[i] = Character.toLowerCase(stringArr[i]);
            }
        }
        return String.valueOf(stringArr);
    }
}
