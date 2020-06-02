import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfParts = scanner.nextInt();
        int readyToShip = 0;
        int tooLarge = 0;
        int tooSmall = 0;

        for (int i = 1; i <= numOfParts; i++) {
            int detectorPrint = scanner.nextInt();
            if (detectorPrint == 1) {
                tooLarge++;
            } else if (detectorPrint == 0) {
                readyToShip++;
            } else if (detectorPrint  == -1) {
                tooSmall++;
            }
        }

        System.out.print(readyToShip);
        System.out.print(" " + tooLarge);
        System.out.print(" " + tooSmall);
    }
}