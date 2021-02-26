/** Write a Java program to remove the duplicate elements of a given array and return the new length of the array.  **/

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Eight_removeDuplicateAndReturnNewLength {
    public static void main(String[] args) {
        int [] numbers = {1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,6,6};
        System.out.println("Input Array: " +Arrays.toString(numbers));
        int length = removeDuplicate(numbers);
        System.out.println("Length of the new Array is: " +length);

        //End of Main
    }

    public static int removeDuplicate (int[] numbers)
    {
        Integer[] temp_numbers = Arrays.stream(numbers).boxed().toArray(Integer[]::new);
        LinkedHashSet<Integer> tempSetNumbers = new LinkedHashSet<Integer>(Arrays.asList(temp_numbers));
        Integer[] temp_final = tempSetNumbers.toArray(Integer[]::new);
        int[] final_array =  Arrays.stream(temp_final).mapToInt(Integer::intValue).toArray();
        System.out.println("output array: "+ Arrays.toString(final_array));
        return final_array.length;
    }
}
