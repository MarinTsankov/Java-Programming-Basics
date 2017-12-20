import java.util.Scanner;

public class E_240416_P03_OperationsBetweenNumbers {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        double N1 = Double.parseDouble(console.nextLine());
        double N2 = Double.parseDouble(console.nextLine());
        String operator = console.nextLine();
        double result = 0;


        if (operator.equals("+")) {
            result = N1 + N2;
            if (result % 2 == 0) {
                System.out.printf("%.0f + %.0f = %.0f - even", N1, N2, result);
            } else {
                System.out.printf("%.0f + %.0f = %.0f - odd", N1, N2, result);
            }
        }
        if (operator.equals("-")) {
            result = N1 - N2;
            if (result % 2 == 0) {
                System.out.printf("%.0f - %.0f = %.0f - even", N1, N2, result);
            } else {
                System.out.printf("%.0f - %.0f = %.0f - odd", N1, N2, result);
            }
        }
        if (operator.equals("*")) {
            result = N1 * N2;
            if (result % 2 == 0) {
                System.out.printf("%.0f * %.0f = %.0f - even", N1, N2, result);
            } else {
                System.out.printf("%.0f * %.0f = %.0f - odd", N1, N2, result);
            }
        }
        if (operator.equals("/")) {
            if (N2 == 0) {
                System.out.printf("Cannot divide %.0f by zero", N1);
                return;
            }
            result = N1 / N2;
            System.out.printf("%.0f / %.0f = %.2f ", N1, N2, result);
        }
        if (operator.equals("%")) {
            if (N2 == 0) {
                System.out.printf("Cannot divide %.0f by zero", N1);
                return;
            }
            result = N1 % N2;
            System.out.printf("%.0f %% %.0f = %.0f ", N1, N2, result);

        }
    }
}