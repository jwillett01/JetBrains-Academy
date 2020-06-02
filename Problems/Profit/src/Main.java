import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyInBank = scanner.nextDouble();
        double interestPercent = scanner.nextDouble();
        double goalAmount = scanner.nextDouble();
        int years = 0;

        while (moneyInBank < goalAmount) {
            years++;
            moneyInBank += moneyInBank * (interestPercent / 100);
        }

        System.out.println(years);
    }
}