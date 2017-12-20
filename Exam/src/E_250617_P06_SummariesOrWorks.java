import java.util.Scanner;

public class E_250617_P06_SummariesOrWorks {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int count = 0;

        for (int a = 1; a <= 30; a++) {
            for (int b = 1; b <= 30; b++) {
                for (int c = 1; c <= 30; c++) {
                    if (a + b + c == n && a < b && b < c) {
                        System.out.println("" + a + " + " + b + " + " + c + " = " + n);
                        count++;
                    } else if (a * b * c == n && a > b && b > c) {
                        System.out.println("" + a + " * " + b + " * " + c + " = " + n);
                        count++;

                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("No!");
        }
    }
}

