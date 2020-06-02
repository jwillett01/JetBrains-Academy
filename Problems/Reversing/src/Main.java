import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int threeDigitNum = scanner.nextInt();
        int firstDigit = threeDigitNum / 100;
        int secondDigit = (threeDigitNum / 10) % 10;
        int thirdDigit = threeDigitNum % 10;

        if (thirdDigit != 0) {
            System.out.print(thirdDigit);
        }
        System.out.print(secondDigit);
        System.out.print(firstDigit);
    }
}