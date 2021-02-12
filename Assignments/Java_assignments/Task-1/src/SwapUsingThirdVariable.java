public class SwapUsingThirdVariable {
    public static void main(String[] args) {
        int a,b;
        a= 5000;
        b = 20;

        System.out.println("Values Before Swaping");
        System.out.println("a: " + a + " \n" + "b: " + b);

        a = a + b;      // a= 5020
        b = a - b;      // b = 5020-20 = 5000
        a = a - b;      // a = 5020-5000 = 20

        System.out.println("Values After Swaping");
        System.out.println("a: " + a + " \n" + "b: " + b);
    }
}
