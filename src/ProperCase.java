import java.util.ArrayList;
import java.util.Scanner;

public class ProperCase {
    static ArrayList<String> stringListe = new ArrayList<String>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        String test = "MIKKEL Er en stor babY";
        properCase(test);

    }


    static void properCase(String sentence) {
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            currentWord = currentWord.toUpperCase();
            if (words[i].equals(currentWord)) {

            } else if (currentWord.length() > 3) {
                currentWord = currentWord.substring(0, 1).toUpperCase() + currentWord.substring(1).toLowerCase();
                words[i] = currentWord;
            } else {
                words[i] = words[i].toLowerCase();

            }
        }

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }

}