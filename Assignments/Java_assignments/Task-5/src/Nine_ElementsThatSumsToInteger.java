/** Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.
 Sample array: [1,2,4,5,6]
 Target value: 6.  **/

public class Nine_ElementsThatSumsToInteger {
    public static void main(String[] args) {

        int a [] = {1,2,4,5,6, 3, 3, 7, -1};
        int value = 6;
        int temp = 0;

        for(int i = 0; i < a.length; i++)
        {
            if(value > a[i])
                  temp = value - a[i];

            else
                temp = value - a[i];


//            System.out.println("i: "+i+"  a[i]: "+a[i]);
//            System.out.println("Temp : "+temp);
            System.out.println();
            for(int j =0; j< a.length && i !=j ; j++)
            {
                // System.out.println("j: "+j+"  a[j]: "+a[j]);
                    if(a[j] ==  temp)
                    {
                        System.out.println("The pair is: " + a[i] + " " + a[j]);
                        System.out.println();
                        break;
                    }

            }
        }
//End Of Main
    }
}
