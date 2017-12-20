import java.util.Scanner;

public class E_240416_P06_SpecialDigits {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int num = 0;

        for (int i = 1111; i < 9999; i++) {
            int temp1 = 0;
            int temp2 = 0;
            int temp3 = 0;
            int temp4 = 0;
            num = i;
            temp4 = num % 10;
            num /= 10;
            temp3 = num % 10;
            num /= 10;
            temp2 = num % 10;
            num /= 10;
            temp1 = num;
            boolean isTrue = temp1 > 0 && temp2 > 0 && temp3 > 0 && temp4 > 0;

            if (isTrue && n % temp1 == 0 && n % temp2 == 0 && n % temp3 == 0 && n % temp4 == 0) {
                System.out.print("" + temp1 + temp2 + temp3 + temp4 + " ");
            }

        }
    }
}
