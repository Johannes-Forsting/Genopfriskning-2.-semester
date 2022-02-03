import java.util.Scanner;

public class Grass {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How long is the grass now in cm?");
        double currentLength = scanner.nextDouble();
        System.out.println("And how long can the grass be before your wife insists it nees to be cut?");
        double maxLength = scanner.nextDouble();
        System.out.println("You need to mow the grass in " + howLongForMow(currentLength, maxLength) + " days.");
    }

    static int howLongForMow(double currentLength, double maximumLength) {
        int daysUntilCut = 0;
        while (currentLength < maximumLength) {
            currentLength += 0.8;
            daysUntilCut++;
        }
        return daysUntilCut;
    }
}
