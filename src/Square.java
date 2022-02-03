public class Square {
    public static void main(String[] args) {
        printSquare(10, "*");

    }

    static void printSquare(int rowsAndColumns, String figure) {

        for (int i = 0; i < rowsAndColumns; i++) {
            for (int j = 0; j < rowsAndColumns; j++) {
                System.out.print(figure + "  ");
            }
            System.out.println();
        }

    }
}
