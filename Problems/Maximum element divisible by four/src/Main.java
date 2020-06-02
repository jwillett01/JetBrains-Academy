import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int noOfElements = scanner.nextInt();
        int maxDivisibleByFour = 0;

        for (int i = 0; i < noOfElements; i++) {
            int nextElement = scanner.nextInt();
            if (nextElement % 4 == 0 && nextElement > maxDivisibleByFour) {
                maxDivisibleByFour = nextElement;
            }
        }
        System.out.println(maxDivisibleByFour);
    }
}