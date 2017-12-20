import java.util.Scanner;

public class E_171217_P06_MultiplyTable {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int temp = 0;
        int temp1 = 0;
        int temp2 = 0;


        temp = n % 10;
        n /= 10;
        temp1 = n % 10;
        n /= 10;
        temp2 = n;

        for (int i = 1; i <= temp; i++) {
            for (int j = 1; j <= temp1; j++) {
                for (int k = 1; k <= temp2; k++) {
                    int result = i * j * k;
                    System.out.println("" + i + " * " + j + " * " + k + " " + "= " + result + ";");

                }

            }

        }

    }
}
