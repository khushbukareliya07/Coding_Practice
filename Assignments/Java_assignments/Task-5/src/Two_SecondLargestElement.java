/** Write a Java program to find the second largest element in an array.  **/

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Two_SecondLargestElement {
    public static void main(String[] args) {

        int [] numbers = {500,1000,2000,3000,4000,3500,3900,3998,1000,2500,2000,500};
        
        int[] newArray = removeDuplicate(numbers);
        System.out.println("Second Largets Element is : " + secondLargestElement(newArray));


        //End of Main
    }

    private static int[] removeDuplicate(int[] numbers) {
        Integer[] updated_numbers = Arrays.stream(numbers).boxed().toArray(Integer[]::new); // converted from int to Integer
        LinkedHashSet<Integer> updated_array = new LinkedHashSet<Integer>(Arrays.asList(updated_numbers)); //set only keeps unique values and remove all the duplicates values.
        Integer [] final_arr1 = updated_array.toArray( new Integer[] {});
        int[] final_arr = Arrays.stream(final_arr1).mapToInt(Integer::intValue).toArray();
        return final_arr;
    }
    public static int secondLargestElement(int [] numbers)
    {
        Arrays.sort(numbers);
        return numbers[numbers.length - 2];
    }


}
