import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        int largestNum = 0;

        do {
            n = scanner.nextInt();
            if (n > largestNum) {
                largestNum = n;
            }
        } while (n != 0);

        System.out.println(largestNum);
    }
}