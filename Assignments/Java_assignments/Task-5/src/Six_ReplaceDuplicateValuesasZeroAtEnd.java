/** Write a program to remove the duplicates from a sorted array change them into 0 and add 0 in the end.
 input: [2,2,3,3,4,4,4,11,11,11,11]
 output:[2,3,4,11,0,0,0,0,0,0,0]  **/

import java.util.Arrays;
import java.util.LinkedHashSet;

public class Six_ReplaceDuplicateValuesasZeroAtEnd {
    public static void main(String[] args) {
        int [] numbers = {2,2,3,3,4,4,4,11,11,11,11};
        System.out.println("Input: " + Arrays.toString(numbers));
        System.out.println("Output: " + Arrays.toString(finalOutputArray(numbers)));

        //End of Main
    }

    public static int[] removeDuplicate(int[] numbers) {
        Integer[] updated_numbers = Arrays.stream(numbers).boxed().toArray(Integer[]::new); // converted from int to Integer
        LinkedHashSet<Integer> updated_array = new LinkedHashSet<Integer>(Arrays.asList(updated_numbers)); //set only keeps unique values and remove all the duplicates values.
        Integer [] final_arr1 = updated_array.toArray( new Integer[] {});
        int[] final_arr = Arrays.stream(final_arr1).mapToInt(Integer::intValue).toArray();
        return final_arr;
    }
    public static int[] finalOutputArray(int[] numbers)
    {
        int[] tmp_array = removeDuplicate(numbers);
        int [] finalArray  = new int[numbers.length];
        for(int i=0; i<tmp_array.length; i++)
        {
            finalArray[i] = tmp_array[i];
        }
        for(int i = tmp_array.length; i< finalArray.length; i++)
        {
            finalArray[i] = 0;
        }
        return finalArray;
    }

}
