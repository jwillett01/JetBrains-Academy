import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int width = scanner.nextInt();
        int segments = scanner.nextInt();

        boolean segmentsPossible = (segments % length == 0 ||
                segments % width == 0) &&
                segments < length * width;

        if (segmentsPossible) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}