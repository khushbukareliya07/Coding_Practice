import java.util.Scanner;

public class ProgramEight_CharacterDisplay {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        char c = obj.next().charAt(0);
        c = Character.toLowerCase(c);

        if(c=='r' || c=='a' || c=='n'|| c=='d'|| c=='o'|| c=='m' )
        {
            System.out.println("FOUND.");
        }
        else
            System.out.println("NOT FOUND.");


    }
}
