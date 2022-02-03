public class Search {
    public static void main(String[] args) {
        String[] words = {"abekat", "musefælde", "ananas", "slut", "solskin"};
        String test = "abekat";
        System.out.println(søgning(words, test));
    }

    static int søgning(String[] words, String wordToSearch) {
        int index = -1;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(wordToSearch)) {
                index = i;
                break;
            }
        }
        try {
            if (index == -1) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("The word is not found in the array.");
        }
        return index;
    }
}
