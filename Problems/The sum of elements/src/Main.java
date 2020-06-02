import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seqElement = scanner.nextInt();
        int sum = 0;

        while (seqElement != 0) {
            sum += seqElement;
            seqElement = scanner.nextInt();
        }

        System.out.println(sum);
    }
}