public class SwapNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c;

        System.out.println("Values Before Swaping");
        System.out.println("a: " + a + " \n" + "b: " + b);

        c = a;  //Value of a saved to c
        a = b;  //Value of b saved to a
        b = c;  //Value of c(old a) assigned to b

        System.out.println("Values After Swaping");
        System.out.println("a: " + a + " \n" + "b: " + b);


    }
}
