import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfElements = scanner.nextInt();
        int maxDivisible = 0;
        int a = 0;

        while (a < numOfElements) {
            int element = scanner.nextInt();
            if (element %  4 == 0 && element > maxDivisible) {
                maxDivisible = element;
            }
            a++;
        }

        System.out.println(maxDivisible);
    }
}