/** Write a Java program to sort an array of positive integers of a given array,
 * in the sorted array the value of the first element should be maximum,
 * second value should be minimum value, third should be second maximum,
 * fourth second be second minimum and so on. **/


import java.lang.reflect.Array;
import java.util.Arrays;

public class Eleven_Max_MinDifferentPrinting {
    public static void main(String[] args) {
        int[] numbers = {1,3,5,7,9,2,10,6,4,8};

        printArray(numbers);

        //End Of Main
    }

    public static void printArray(int[] numbers)
    {
//        System.out.println("Entered");
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
        int end ;
        int start = 0;
        int i=0;
        int [] finalArray = new int[numbers.length];

        for(start =0,end = numbers.length-1; start <= end && start < numbers.length; start++, end--)
        {
            if(start == end) {
                finalArray[i] = numbers[start];
                break;
            }

            finalArray[i++] = numbers[end];
            finalArray[i] = numbers[start];
            i++;
        }


        System.out.println("Final Array is: "+ Arrays.toString(finalArray));
    }

}
