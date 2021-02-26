/** Write a Java program to remove duplicate elements from an array.  **/

import java.util.Arrays;
import java.util.LinkedHashSet;

public class One_RemovingDuplicateFromArray {
    public static void main(String[] args) {
        Integer [] numbers = {1,2,3,4,5,1,2,3,4,5,1,2,8,5,99};

        /** Approach 1 : Using Set*/
        System.out.println(Arrays.toString(removeDuplicates(numbers)));

        /** Approach 2: Using regular for loop concept.(Brute-Force Method) **/
       System.out.println("The final result is : " + Arrays.toString(removeDuplicatesInArray(numbers)));

       /** End Of Main**/
    }

    public static Integer[] removeDuplicates (Integer [] numbers)
    {
        LinkedHashSet<Integer> updated_array = new LinkedHashSet<>(Arrays.asList(numbers)); //set only keeps unique values and remove all the duplicates values.
        Integer [] final_arr = updated_array.toArray( new Integer[] {});
        return final_arr;
    }

    public static int[] removeDuplicatesInArray (Integer [] numbers)
    {
        //converting Integer[] to int[]
        int [] numbersArr =  Arrays.stream(numbers).mapToInt(Integer::intValue).toArray();

        //Now performing actions onto the int[] numbersArray.
        int [] temp = new int[numbersArr.length];
        int k = 0;
        int count = 0;
        boolean flag = true;
        temp[k] = numbersArr[0];
        for(int i = 1; i<numbersArr.length; i++)
        {
                for(int j =0; j < i; j++ )
                {
                        if(numbersArr[i] != temp[j])
                            flag = true;
                        else {
                            flag = false;
                            count++;
                        }

                }
                if(flag && count==0)
                     temp[++k] = numbersArr[i];
                else
                    count = 0;
        }
        int [] finalArr = Arrays.copyOf(temp, k+1);
        return finalArr;
    }
}

