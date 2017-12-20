import java.util.Scanner;

public class E1_190317_P06_TwoNumbersSum {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int begining = Integer.parseInt(console.nextLine());
        int end = Integer.parseInt(console.nextLine());
        int magicNumber = Integer.parseInt(console.nextLine());
        int count = 0;
        int combination = 0;

        for (int i = begining; i >= end; i--) {
            for (int j = begining; j >= end; j--) {
                count++;
                combination = 0;
                combination = i + j;
                if (combination == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, i, j, magicNumber);
                    break;
                }
            }
            if (combination == magicNumber) {
                break;

            }
        }
        if (combination != magicNumber) {
            System.out.printf("%d combinations - neither equals %d", count, magicNumber);
        }
    }
}
