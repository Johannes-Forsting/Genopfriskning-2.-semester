import java.util.ArrayList;

public class Arraylist {

    static ArrayList<String> stringListe = new ArrayList<String>();

    public static void main(String[] args) {
        ArrayList<String> stringListe = new ArrayList<String>();
        stringListe.add("æble");
        stringListe.add("banan");
        stringListe.add("pære");
        stringListe.add("ananas");

        String tester = "æble";
        System.out.println(doesArraylistContainString(stringListe, tester));
    }

    static boolean doesArraylistContainString(ArrayList list, String tester) {
        boolean returnBool = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(tester)) {
                returnBool = true;
                System.out.println("The String has been found");
            }
        }
        if (returnBool == false) {
            stringListe.add(tester);
        }
        return returnBool;
    }
}
