import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstTimeHour = scanner.nextInt();
        int firstTimeMinutes = scanner.nextInt();
        int firstTimeSeconds = scanner.nextInt();
        int secondTimeHour = scanner.nextInt();
        int secondTimeMinutes = scanner.nextInt();
        int secondTimeSeconds = scanner.nextInt();

        firstTimeHour *= 3600;
        firstTimeMinutes *= 60;
        int firstTime = firstTimeHour + firstTimeMinutes + firstTimeSeconds;

        secondTimeHour *= 3600;
        secondTimeMinutes *= 60;
        int secondTime = secondTimeHour + secondTimeMinutes + secondTimeSeconds;

        System.out.print(secondTime - firstTime);
    }
}