import java.util.ArrayList;

public class Bibliotek {
    private ArrayList<Opstart2.semester.Bog> bøger;

    public Bibliotek() {
        this.bøger = new ArrayList<Opstart2.semester.Bog>();
    }

    public void addBook(Opstart2.semester.Bog currentBook) {
        bøger.add(currentBook);
    }

    public boolean checkIfBookExists(Opstart2.semester.Bog currentBook) {
        boolean returnBool = false;
        for (int i = 0; i < bøger.size(); i++) {
            if (bøger.get(i).getISBNnr().equals(currentBook.getISBNnr())) {
                returnBool = true;
            }
        }
        return returnBool;
    }

    public static void main(String[] args) {
        Bibliotek biblo = new Bibliotek();
        Opstart2.semester.Bog bog1 = new Opstart2.semester.Bog("123", "Harry potter 1", 1998);
        biblo.addBook(bog1);
        Opstart2.semester.Bog bog2 = new Opstart2.semester.Bog("1236", "Harry potter 2", 2000);
        biblo.addBook(bog2);
        Opstart2.semester.Bog bog3 = new Opstart2.semester.Bog("1235", "Harry potter 3", 1999);
        biblo.addBook(bog3);

        Opstart2.semester.Bog bog4 = new Opstart2.semester.Bog("1234", "Harry potter 4", 1997);
        System.out.println(biblo.checkIfBookExists(bog4));
    }

}
