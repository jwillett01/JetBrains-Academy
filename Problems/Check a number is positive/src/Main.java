import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (scanner.nextInt() > 0) {
            System.out.print("YES");
        } else {
            System.out.println("NO");
        }
    }
}