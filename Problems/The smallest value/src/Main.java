import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long m = scanner.nextLong();
        int n = 1;
        long i = 1;

        while (i <= m) {
            n++;
            i *= n;
        }

        System.out.println(n);
    }
}