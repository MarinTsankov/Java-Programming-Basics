import java.util.Scanner;

public class E_161217_P06_BarcodeGenerator {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int num1 = Integer.parseInt(console.nextLine());
        int num2 = Integer.parseInt(console.nextLine());

        int n14 = num1 % 10;
        num1 /= 10;
        int n13 = num1 % 10;
        num1 /= 10;
        int n12 = num1 % 10;
        num1 /= 10;
        int n11 = num1;

        int n24 = num2 % 10;
        num2 /= 10;
        int n23 = num2 % 10;
        num2 /= 10;
        int n22 = num2 % 10;
        num2 /= 10;
        int n21 = num2;

        for (int i = n11; i <= n21; i++) {
            for (int j = n12; j <= n22; j++) {
                for (int k = n13; k <= n23; k++) {
                    for (int l = n14; l <= n24; l++) {
                        if (i % 2 != 0 && j % 2 != 0 && k % 2 != 0 && l % 2 != 0) {
                            System.out.print("" + i + j + k + l + " ");
                        }

                    }

                }
            }
        }
    }
}
