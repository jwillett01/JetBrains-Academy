import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int classroom1 = scanner.nextInt();
        int classroom2 = scanner.nextInt();
        int classroom3 = scanner.nextInt();

        classroom1 = classroom1 / 2 + classroom1 % 2;
        classroom2 = classroom2 / 2 + classroom2 % 2;
        classroom3 = classroom3 / 2 + classroom3 % 2;

        int total = classroom1 + classroom2 + classroom3;

        System.out.println(total);
    }
}