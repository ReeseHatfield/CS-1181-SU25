import java.util.HashMap;
import java.util.Map;

public class Driver extends Object{
    public static void main(String[] args) throws Exception {
        

        // System.out.println(countOccurances('l', "hello world"));

        // doThing();


        // System.out.println(countOccurancesRecursive('l', "lllhello"));


        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));
        System.out.println(fib(6));
        System.out.println(fib(7));
        System.out.println(fib(8));
        System.out.println(fib(9));
        System.out.println(fib(10));


    }

    // return the Nth fibonacci number
    public static int fib(int n) {
        // Base case
        if(n == 0 || n == 1) {
            return 1;
        }

        // simplify and combine
        // add together values of two fibonacci number

        return fib(n - 1) + fib(n - 2); 

    }


    public static int countOccurancesRecursive(char target, String searchMe){

        // base case to being the empty string
        if(searchMe.length() == 0) {
            return 0;
        }

        // we need to head towards the string being empty
        if (searchMe.charAt(0) == target){
            return 1 + countOccurancesRecursive(target, searchMe.substring(1));
        } else {
            return 0 + countOccurancesRecursive(target, searchMe.substring(1));
        }


    }


    // public static void doThing(){
    //     // do stuff

    //     doThing();
    // }


    public static int countOccurances(char targetLetter, String searchMe) throws Exception {


        Map<Character, Integer> map = new HashMap<>();

        for(char currentChar: searchMe.toCharArray()){
            if(map.containsKey(currentChar)){
                int currentValue = map.get(currentChar);

                map.put(currentChar, currentValue + 1);
            }
            else {
                map.put(currentChar, 1);
            }

        }

        System.out.println(map);


        throw new Exception("oopsies");

        // return map.get(targetLetter);

    }
}

