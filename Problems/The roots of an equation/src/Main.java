import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numC = scanner.nextInt();
        int numD = scanner.nextInt();

        for (int i = 0; i <= 1000; i++) {
            if (numA * (i * i * i) + numB *  (i * i) + numC * i + numD == 0) {
                System.out.println(i);
            }
        }
    }
}