public class TestFibonacci {
    public static void main(String[] args) {
        int n = 15;
        int a = 1;
        int b = 1;
        System.out.print(a + " " + b);
        // започваме for  от i=3, защотот искаме 15 числа. Първите две числа са по - горе принтираните (а + " " + b)
        for (int i = 3; i <= n; i++) {
            b = a + b;
            a = b - a;
            System.out.print(" " + b);
        }
    }
}
