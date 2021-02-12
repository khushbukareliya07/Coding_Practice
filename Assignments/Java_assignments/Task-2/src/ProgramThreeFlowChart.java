public class ProgramThreeFlowChart {

    public static void main(String[] args) {

        int a =10, b = 25, c = 85;
        float avg  = (a + b + c) / 3;

        System.out.println("avg = "+avg);

        if(avg > a)
        {
            if(avg > b)
            {
                if(avg > c)
                {
                    System.out.println("avg is higher than a, b, c.");
                }
                else
                {
                    System.out.println("avg is higher than a, b.");
                }
            }

            else if(avg > c)
            {
                System.out.println("avg is higher than a, c.");
            }

            else
            {
                System.out.println("avg is just higher than a.");
            }

        }

        else if( avg > b)
        {
            if(avg > c)
                System.out.println("avg is higher than a, c.");
            else
                System.out.println("avg is just higher than b");
        }

        else
        {
            System.out.println("avg is just higher than c.");
        }




    }
}
