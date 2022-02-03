import java.util.Arrays;
import java.util.Collections;

public class Sortering {
    static String[] words = {"abekat", "musefælde", "ananas", "slut", "solskin"};

    public static void main(String[] args) {

        sortList(words);

    }

    static void sortList(String[] words) {
        String[] wordsSorted = new String[words.length];
        Arrays.sort(words, Collections.reverseOrder());

        for (int i = 0; i < wordsSorted.length; i++) {
            System.out.println(words[i]);
        }
    }
}
