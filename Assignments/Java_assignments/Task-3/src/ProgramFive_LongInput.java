import java.util.Scanner;

public class ProgramFive_LongInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long number = input.nextLong();
        char [] numberArray = String.valueOf(number).toCharArray();

        long sum = 0l;

        for(int i = 0; i< numberArray.length; i++) {
            sum += Character.getNumericValue(numberArray[i]);
        }

        System.out.println("The number is:  "+number);
        System.out.println("The Sum is: " +sum);



        //Method 2:  to convert number to string to char and to number again.
//        String strNumebr = Long.toString(number);
//        char []  numberArr = strNumebr.toCharArray();
//
//        for(int i = 0; i< numberArray.length; i++) {
//            sum += Integer.parseInt(String.valueOf(numberArr[i]));
            //Method 3:




    }


    }

