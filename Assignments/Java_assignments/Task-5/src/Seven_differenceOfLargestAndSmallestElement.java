/** Write a Java program to get the difference between the largest and smallest v
 * alues in an array of integers. The length of the array must be 1 and above.  **/

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Seven_differenceOfLargestAndSmallestElement {
    public static void main(String[] args) {
        int [] numbers = {10,1000,2000,3000,4000,3500,3900,3998,1000,2500,2000,500,10010};
        if(numbers.length <=1)
        {
            System.out.println("Array Length Must be grater than 1.");
        }
        else
        {
            int[] newArray = removeDuplicate(numbers);
            System.out.println("Difference of the Largest and Smallest Numbers are : " + (largestElement(newArray) - smallestElement(newArray)));
        }
        //End Of Main
    }
    private static int[] removeDuplicate(int[] numbers) {
        Integer[] updated_numbers = Arrays.stream(numbers).boxed().toArray(Integer[]::new); // converted from int to Integer
        LinkedHashSet<Integer> updated_array = new LinkedHashSet<Integer>(Arrays.asList(updated_numbers)); //set only keeps unique values and remove all the duplicates values.
        Integer [] final_arr1 = updated_array.toArray( new Integer[] {});
        int[] final_arr = Arrays.stream(final_arr1).mapToInt(Integer::intValue).toArray();
        return final_arr;
    }
    public static int smallestElement(int [] numbers)
    {
        Arrays.sort(numbers);
        return numbers[0];
    }
    public static int largestElement(int [] numbers)
    {
        Arrays.sort(numbers);
        return numbers[numbers.length - 1];
    }
}
