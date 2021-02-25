import java.util.Scanner;

/** Write a JAVA program that reverse the words of a sentence.
 For eg, => “Be Happy and Stay Motivated” => “eB yppah dna yatS detavitoM”
 **/

public class Four_a_WordReversalInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String:  ");
        String str  = input.nextLine();
        input.close();
        System.out.println("Reversed String is : " +reverseWord(str));


        /*** END OF MAIN ***/
    }

    public static String reverseWord(String str1)
    {
        String [] wordArray = str1.split(" "); // abc def
        String revString  = "";
        for(int i = 0; i< wordArray.length; i++)    //wordArray : [abc, def]
        {
            String word = wordArray[i];             //word: abc
            String reverseWord = "";

            for(int j = word.length() -1 ; j>=0 ; j--)
            {
                reverseWord =  reverseWord + word.charAt(j); //cba
            }

            revString += reverseWord + " ";
        }
        return revString;
    }
}
