/** Write a Java program to move all 0's to the end of an array.
 * Maintain the relative order of the other (non-zero) array elements. **/

import java.util.Arrays;

public class Five_MovingZeroToEnd {
    public static void main(String[] args) {
        int [] numbers = {500,1000,2000,3000,4000,0,3500,3900,3998,0,1000,2500,2000,500,0};
        movingZeroAtEnd(numbers);


    //End of Main
    }

    public static void movingZeroAtEnd( int [] numbers)
    {
        int[] temp = new int[numbers.length];
        int countZero = 0;
        int j = 0;
        for(int i = 0; i < numbers.length ; i++){

            if(numbers[i] == 0)
                countZero++;
            else
                temp[ j++] = numbers[i];
        }

        j--;
        while(j < numbers.length)
        {
            temp[j++] = 0;
        }
        System.out.println("Input Array: "+Arrays.toString(numbers));
        System.out.println("Modified Array: "+Arrays.toString(temp));
    }
}
