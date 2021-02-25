/* Write a JAVA program that takes given String of words and return the length of the shortest word. */


import java.util.Scanner;

public class Task_Four_ProgramOne_ShortWorLength {

    public static void main(String[] args) {

        Scanner input   = new Scanner(System.in);
        System.out.println("Enter a String.");
        String str = input.nextLine();

        int c = str.length() ;
        int count = 0;
        //str  : I am Khushbu Kareliya.
        String [] strArray = str.split(" ");

        for(int i = 0; i< str.length(); i++)
        {
            if(str.charAt(i) != ' ')
            {
                System.out.print(str.charAt(i));
                count++;
            }

            else
            {
                System.out.println("\n Else  loop: c  values assigned !");
                c = Math.min(c, count);
                System.out.println("value of C: " +c);

                System.out.println("resetting count");
                count = 0 ;
            }

        }
        System.out.println("\n\n Final Value of Count: " + c);



//*** END OF MAIN ***
    }
}
