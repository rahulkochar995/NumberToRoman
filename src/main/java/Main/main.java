package Main;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class main {

    public String input(Scanner sc) {
    	return sc.nextLine();
    }

    public int convert(String string) {
      if (string.equals("I") return 1;
    }

    public static void main(String[] args) {
        HashMap<String, Integer> dictionary = new HashMap<String, Integer>();

        dictionary.put("I", 1);
        dictionary.put("V", 5);
        dictionary.put("X", 10);
	dictionary.put("L", 50);
	dictionary.put("C", 100);
	dictionary.put("D", 500);
	dictionary.put("M", 1000);

	Scanner sc = new Scanner(System.in);
	String in = input(sc);
    }
}
