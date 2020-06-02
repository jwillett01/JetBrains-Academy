import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int reeses = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();

        boolean weekend = isWeekend && reeses >= 15 && reeses <= 25;
        boolean weekday = !isWeekend && reeses >= 10 && reeses <= 20;

        System.out.println(weekday || weekend);
    }
}