import java.util.HashMap;
import java.util.Map;

public class Main {
    static final String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";

    public static void main(String[] args) {
        Map<Character, Integer> words = new HashMap<>();
        char[] symbols = text.toLowerCase().toCharArray();


        for (int i = 0; i < symbols.length; i++) {
            if (Character.isLetter(symbols[i])) {
                if (words.containsKey(symbols[i])) {
                    int q = words.get(symbols[i]);
                    q++;
                    words.put(symbols[i], q);
                } else {
                    words.put(symbols[i], 1);
                }
                //       System.out.println(words);
            }
        }

    }
}

