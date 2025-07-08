import java.util.HashMap;
import java.util.Map;

public class Driver {
    public static void main(String[] args) {
        // System.out.println(countOccurancesRecursive('z', "zhello worldszz"));

        // System.out.println(fibonacci(1));
        // System.out.println(fibonacci(2));
        // System.out.println(fibonacci(3));
        // System.out.println(fibonacci(4));
        // System.out.println(fibonacci(5));
        // System.out.println(fibonacci(6));
        // System.out.println(fibonacci(7));
        // System.out.println(fibonacci(8));



        Map<Character, Integer> map = countOccurances('l', "hello world", new HashMap<>());

        System.out.println(map);



    }


    public static int countOccurances(char targetChar, String searchMe) {
        Map<Character, Integer> map = new HashMap<>();

        // // init map to 0
        // for(char c = 'a'; c < 'z'; c++){
        //     map.put(c, 0);
        // }

        for(char c: searchMe.toCharArray()){
            if(map.containsKey(c)){
                int currentValue = map.get(c);

                map.put(c, currentValue + 1);
            }
            else {
                map.put(c, 1); // it has now shown up once lol 
            }
        }
        

        return map.get(targetChar);

    }


    public static int countOccurancesRecursive(char targetChar, String searchMe){

        // if there is nothing, I know that cant have a target
        if(searchMe.length() == 0) {
            return 0;
        }


        if (searchMe.charAt(0) == targetChar) {
            return 1 + countOccurancesRecursive(targetChar, searchMe.substring(1));
        } else {
            return 0 + countOccurancesRecursive(targetChar, searchMe.substring(1));
        }

    }



    public static int fibonacci(int n) {
        if(n <= 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }



    public static Map<Character, Integer> countOccurances(char targetChar, String searchMe, Map<Character, Integer> map) {
        // Map<Character, Integer> map = new HashMap<>();

        // start with just char and String
        // make the map, -> annoyed that it gets reset,
        // pass it in as params

        if(searchMe.length() == 0) {
            return map;
        }

        
        char c = searchMe.charAt(0);
        if(map.containsKey(c)){
            int currentValue = map.get(c);

            map.put(c, currentValue + 1);
        }
        else {
            map.put(c, 1); // it has now shown up once lol 
        }
        
        map = countOccurances(targetChar, searchMe.substring(1), map);


        return map;

    }



}