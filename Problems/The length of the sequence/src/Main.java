import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean isZero = false;
        int seqLength = 0;

        while (!isZero) {
            if (scanner.nextInt() == 0) {
                isZero = true;
            } else {
                seqLength++;
            }
        }

        System.out.println(seqLength);
    }
}