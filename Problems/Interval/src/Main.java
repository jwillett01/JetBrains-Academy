import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        boolean range1 = a > -15 && a <= 12;
        boolean range2 = a > 14 && a < 17;
        boolean range3 = a >= 19;

        if (range1 || range2 || range3) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}