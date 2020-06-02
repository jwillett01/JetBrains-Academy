import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = scanner.nextInt();
        int firstDigit = inputNum / 1000;
        int secondDigit = (inputNum / 100) % 10;
        int thirdDigit = (inputNum / 10) % 10;
        int fourthDigit = inputNum % 10;

        if (firstDigit == fourthDigit && secondDigit == thirdDigit) {
            System.out.println(1);
        } else {
            System.out.println(37);
        }
    }
}