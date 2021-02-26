/** Write a Java program to add two matrices of the same size.  **/

public class Four_twoMatricesAddition {
    public static void main(String[] args) {

        int[][] m1 = {{1,2,3},{4,5,6}};
        int m2 [][] = {{9,8,7}, {6,5,4}};
        int result [][] = new int[2][3]; // make sure m1 and m2 has same length
        //System.out.println("m1 length"  +m1.length + "m2: "+m2.length);

        for(int i = 0; i< 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                result [i][j] = m1[i][j] + m2[i][j];
                System.out.print(result[i][j] + "  " );
            }
            System.out.println();
        }

        //End of main
    }

}
