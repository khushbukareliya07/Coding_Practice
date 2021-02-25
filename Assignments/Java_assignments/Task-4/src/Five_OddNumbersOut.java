/** Write a JAVA program that takes out the even from the odds and odd from the list of even numbers,
 For eg, =>
 {23,25,75,87,47,1,91,51,2} //Output for this case =>2
 {22,44,64,76,98,12,43,54,90} // Output for this case =>43.  **/

public class Five_OddNumbersOut {
    public static void main(String[] args) {

        int num [] = {23,25,75,87,47,1,91,51,2};
        int odd =0, even =0;
        for(int i = 0; i < num.length /2; i++)
        {
            if(num[i] % 2 == 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }

        if(even > odd)           //That's Even array!
        {
//            System.out.println("It's Even Array!");
            for(int i=0; i < num.length; i++)
            {
                if(num[i] % 2 != 0)
                {
                    System.out.println(num[i]);
                }
            }
        }
        else                    //That's Odd array!
        {
//            System.out.println("It's ODD Array!");
            for(int i=0; i < num.length ; i++)
            {
                if(num[i] % 2 == 0)
                {
                    System.out.println(num[i]);
                }
            }
        }
    }
}
