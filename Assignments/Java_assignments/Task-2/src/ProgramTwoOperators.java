/*
* 2. 	Write a program in JAVA to perform the following operator based task:
Ask user to choose the following option first:
If User Enter 1 - Addition
If User Enter 2 - Subtraction
If User Enter 3 - Division
If User Enter 4 - Multiplication
If User Enter 5 - Average
Ask user to enter the 2 numbers in a variable for first and second(first and second are variable names) for the first 4 options mentioned above and print the result.
Ask user to enter two more numbers as first1 and second2 for calculating the average as soon as user choose an option 5.
At the end if the answer of any operation is Negative print a statement saying “Oops option X(1/2/3/4/5/) is returning the negative number”
NOTE: At a time user can perform one action at a time.
* */

import java.util.Scanner;

public class ProgramTwoOperators {

    public static void main(String[] args) {

        int first =0, second =0, first1 =0 , second2 = 0;
        boolean x = true;
        Scanner obj = new Scanner(System.in);

        //Declaring infinite loop to keep the calculator open until user chose to quit.
        while (x) {

            System.out.println("\n \n \n See the following options for operationa and choose the number accordingly.");
            System.out.println( "1 - Addition \n" +
                    "2 - Subtraction \n"+
                    "3 - Division \n" +
                    "4 - Multiplication \n"+
                    "5 - Average \n"+
                    "0 - Quit");

            int choice = obj.nextInt();


            switch(choice) {

                case 1: //performing addition
                {
                    System.out.println ("Enter following numbers to perform operation.");
                    System.out.println("Enter first Number = ");
                    first = obj.nextInt();
                    System.out.println("Enter second Number = ");
                    second = obj.nextInt();
                    System.out.println("You have chose to add. \nThe result is = "+(first + second));
                    obj.nextLine();
                    break;

                }
                case 2: //Subtraction
                {   int result =0;

                    System.out.println ("Enter following numbers to perform operation.");
                    System.out.println("Enter first Number = ");
                    first = obj.nextInt();
                    System.out.println("Enter second Number = ");
                    second = obj.nextInt();

                    if(first > second)
                        result = first - second;
                    else
                        result = second - first;
                    System.out.println("You have chose to subtract. \nThe result is = "+result);
                    obj.nextLine();
                    break;
                }
                case 3: //performing division
                {
                    System.out.println ("Enter following numbers to perform operation.");
                    System.out.println("Enter first Number = ");
                    first = obj.nextInt();
                    System.out.println("Enter second Number = ");
                    second = obj.nextInt();
                    obj.nextLine();
                    System.out.println("You have chose to Divide. \nThe result is = "+(first / second));
                    break;
                }
                case 4: //performing multiplication
                {
                    System.out.println ("Enter following numbers to perform operation.");
                    System.out.println("Enter first Number = ");
                    first = obj.nextInt();
                    System.out.println("Enter second Number = ");
                    second = obj.nextInt();
                    obj.nextLine();
                    System.out.println("You have chose to multiply. \nThe result is = "+(first * second));
                    break;
                }
                case 5: //performing average operation
                {
                    System.out.println ("Enter following numbers to perform operation.");
                    System.out.println("Enter first Number = ");
                    first = obj.nextInt();
                    System.out.println("Enter second Number = ");
                    second = obj.nextInt();
                    System.out.println("Enter third Number = ");
                    first1 = obj.nextInt();
                    System.out.println("Enter fourth Number = ");
                    second2 = obj.nextInt();
                    obj.nextLine();
                    System.out.println("You have chose to find average. \nThe result is = "+( (first + second + first1 + second2 )/4));
                    break;
                }
                case 0:
                {
                    System.out.println("You have chose to quit. Happy Coding.");
                    x = false;
                    break;
                }
            }

        }
    }
}
