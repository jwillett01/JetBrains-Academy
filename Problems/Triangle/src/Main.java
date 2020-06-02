import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();
        int sideC = scanner.nextInt();

        boolean isTriangle = sideA + sideB > sideC &&
                sideA + sideC > sideB &&
                sideB + sideC > sideA;

        if (isTriangle) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}