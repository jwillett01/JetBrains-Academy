import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        float total = 0;
        float numDivisible = 0;

        for (; numA <= numB; numA++) {
            if (numA % 3 == 0) {
                total += numA;
                numDivisible++;
            }
        }
        System.out.println(total / numDivisible);
    }
}