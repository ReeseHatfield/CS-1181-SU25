public class Calculator {
    public static int add(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int intDivide(int n, int d){
        if (d == 0) {
            throw new ArithmeticException("cannot divide by 0");
        }

        return n / d;
    } 

    public static int multiply(int a, int b) {
        return a * b;
    }
}