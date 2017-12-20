import java.util.Scanner;

public class P10_Diamond {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int dashes = (n - 1) / 2;
        int midDashes = n - 2 * dashes - 2;
        int asterisk = -1;
        boolean isEven = n % 2 == 0;


        if (n == 1) {
            System.out.println("*");
            return;
        }
        if (n == 2) {
            System.out.println("**");
            return;
        }
        if (isEven) {
            asterisk = 2;
            midDashes = 2;
        } else {
            asterisk = 1;
            midDashes = 1;
        }

        for (int row = 0; row < (n + 1) / 2; row++) {
            if (row == 0) {
                System.out.print(repeatStr("-", dashes));
                System.out.print(repeatStr("*", asterisk));
                System.out.println(repeatStr("-", dashes));
            } else {
                System.out.print(repeatStr("-", dashes - row));
                System.out.print("*");
                System.out.print(repeatStr("-", midDashes));
                System.out.print("*");
                System.out.println(repeatStr("-", dashes - row));
                midDashes += 2;
            }
        }
        for (int row = 0; row < n / 2 - 1; row++) {
            dashes = 1;
            System.out.print(repeatStr("-", dashes + row));
            System.out.print("*");
            System.out.print(repeatStr("-", midDashes - 4));
            System.out.print("*");
            System.out.println(repeatStr("-", dashes + row));
            midDashes -= 2;
        }
        if (!isEven) {
            for (int row = n; row <= n; row++) {
                System.out.print(repeatStr("-", row / 2));
                System.out.print(repeatStr("*", asterisk));
                System.out.println(repeatStr("-", row / 2));
            }
        }
    }

    static String repeatStr(String text, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb.toString();
    }
}
