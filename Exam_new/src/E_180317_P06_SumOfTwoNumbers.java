import java.util.Scanner;

public class E_180317_P06_SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        int beginning = Integer.parseInt(console.nextLine());
        int end = Integer.parseInt(console.nextLine());
        int magicNumber = Integer.parseInt(console.nextLine());
        int sum = 0;
        int count = 0;
        int temp1 = 0;
        int temp2 = 0;

        for (int i = beginning; i <= end; i++) {
            for (int j = beginning; j <= end; j++) {
                temp1 = i;
                temp2 = j;
                sum = temp1 + temp2;
                count++;
                if (sum == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, temp1, temp2, magicNumber);
                    break;
                }
            }
            if (sum == magicNumber) {
                break;

            }
        }
        if (sum != magicNumber) {
            System.out.printf("%d combinations - neither equals %d", count, magicNumber);
        }
    }
}