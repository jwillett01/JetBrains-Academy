import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int poleHeight = scanner.nextInt();
        int feetUpPerDay = scanner.nextInt();
        int feetDownPerNight = scanner.nextInt();
        int progress = feetUpPerDay;
        int days = 1;

        while (progress < poleHeight) {
            progress += feetUpPerDay - feetDownPerNight;
            days += 1;
        }
        System.out.println(days);
    }
}