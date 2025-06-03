public class Calculator {
    public static int add(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    // ctrl + shift + p  -> command pallete
    // enable java tests
    // Junit Jupityer
    public static int intDivide(int n, int d) {
        if (d == 0) {
            throw new ArithmeticException("cannot divide by 0");
        }

        return n / d;
    } 

    public static int multiply(int a, int b) {
        return a * b;
    }


    public static String processString(String s){
        String lower = s.toLowerCase();

        String noZs = lower.replaceAll("z", "");

        String underscoredString = "__" + noZs + "__";



        return doThing(underscoredString);
    }

    // this is code that someone else wrote, 
    public static String doThing(String s){
        return s;
    }
}

// Calculator.add(4, 5)