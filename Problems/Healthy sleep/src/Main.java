import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int recommendedSleep = scanner.nextInt();
        int maxSleep = scanner.nextInt();
        int annesSleep = scanner.nextInt();

        if (annesSleep < recommendedSleep) {
            System.out.println("Deficiency");
        } else if (annesSleep > maxSleep) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}