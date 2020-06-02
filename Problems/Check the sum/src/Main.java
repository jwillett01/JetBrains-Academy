import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        boolean sum1 = a + b ==  20;
        boolean sum2 = a + c == 20;
        boolean sum3 = b + c == 20;

        System.out.println(sum1 || sum2 || sum3);
    }
}