import java.util.Scanner;

public class E_280816_P06_Digits {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int digit = Integer.parseInt(console.nextLine());

        int temp = digit;
        int thirdDigit = temp % 10;
        temp /= 10;
        int secondDigit = temp % 10;
        temp /= 10;
        int firstDigit = temp % 10;

        int rows = firstDigit + secondDigit;
        int cols = firstDigit + thirdDigit;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {

                if (digit % 5 == 0) {
                    digit -= firstDigit;
                    System.out.print(digit + " ");
                } else if (digit % 3 == 0) {
                    digit -= secondDigit;
                    System.out.print(digit + " ");
                } else {
                    digit += thirdDigit;
                    System.out.print(digit + " ");
                }

            }
            System.out.println();
        }
    }
}
