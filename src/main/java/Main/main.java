package Main;

import java.util.HashMap;
import java.util.HashSet;

public class main {
    
    //This is the main method.
    public static void main(String[] args) {
        System.out.println("Hello world");

        //HashMap takes String as input and returns the corresponding number between 1-9.
        HashMap<String, Integer> dictionary = new HashMap<String, Integer>();

        //Adding data to the HashMap
        dictionary.put("I", 1);
        dictionary.put("V", 5);
        dictionary.put("X", 10);
    }
}
