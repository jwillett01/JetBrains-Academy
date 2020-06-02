import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isAscending = true;
        boolean isDescending = true;
        int prevVal = scanner.nextInt();
        int currentVal = scanner.nextInt();

        while (currentVal != 0) {

            if (prevVal <= currentVal) {
                isDescending = false;
            } else if (prevVal >= currentVal) {
                isAscending = false;
            }

            prevVal = currentVal;
            currentVal = scanner.nextInt();
        }

        System.out.println(isAscending || isDescending);

    }
}