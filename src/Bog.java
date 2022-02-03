public class Bog {
    private String ISBNnr;
    private String titel;
    private int udgivelsesÅr;

    public Bog(String ISBNnr, String titel, int udgivelsesÅr) {
        this.ISBNnr = ISBNnr;
        this.titel = titel;
        this.udgivelsesÅr = udgivelsesÅr;
    }

    public String getISBNnr() {
        return ISBNnr;
    }

    public String getTitel() {
        return titel;
    }

    public int getUdgivelsesÅr() {
        return udgivelsesÅr;
    }

    public void setISBNnr(String ISBNnr) {
        this.ISBNnr = ISBNnr;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public void setUdgivelsesÅr(int udgivelsesÅr) {
        this.udgivelsesÅr = udgivelsesÅr;
    }

    @Override
    public String toString() {
        return "ISBN-nr: " + ISBNnr +
                "Titel: " + titel +
                "Udgivelsesår: " + udgivelsesÅr;
    }
}
