import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int firstNum = num / 100;
        int secondNum = (num / 10) % 10;
        int thirdNum  = num % 10;
        System.out.println(firstNum + secondNum + thirdNum);
    }
}