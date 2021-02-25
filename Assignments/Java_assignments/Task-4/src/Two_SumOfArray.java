//Write a JAVA program that gives sum of all the values of array except the highest and lowest values.

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Two_SumOfArray {

    public static void main(String[] args) {
        int [] arr = {1,3,5,77,88,99,2,3,34,66};
        //int [] arr2 = IntStream.rangeClosed(10,30).toArray();\
        Arrays.sort(arr);
        int sum =0;
        for(int i = 1; i < arr.length -1; i++)
        {
            sum += arr[i];
        }
        System.out.println("Sum is: "+sum);

    /*** END OF MAIN ***/
    }

}
