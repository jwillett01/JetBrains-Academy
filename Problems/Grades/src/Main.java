import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numOfGrades = scanner.nextInt();
        int aGrades = 0;
        int bGrades = 0;
        int cGrades = 0;
        int dGrades = 0;

        for (int i = 0; i < numOfGrades; i++) {
            int grade = scanner.nextInt();
            if (grade == 5) {
                aGrades++;
            } else if (grade == 4) {
                bGrades++;
            } else if (grade == 3) {
                cGrades++;
            } else if (grade == 2) {
                dGrades++;
            }
        }

        System.out.print(dGrades);
        System.out.print(" " + cGrades);
        System.out.print(" " + bGrades);
        System.out.print(" " + aGrades);
    }
}