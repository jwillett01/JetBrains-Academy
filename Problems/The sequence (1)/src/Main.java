import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int countNumbers = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                if (countNumbers == n) {
                    break;
                }
                System.out.print(i + " ");
                countNumbers++;
            }
        }
    }
}