import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        boolean isComposite = false;

        if (number > 0) {
            for (long i = 2; i < 1000; i++) {
                if (i == number) {
                    continue;
                } else if (number % i == 0) {
                    isComposite = true;
                    break;
                }
            }
        }
        return isComposite;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}