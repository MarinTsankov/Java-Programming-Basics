import java.util.Scanner;

public class E_230717_P05_Cup {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int dotMiddle = 2 * n - 2;
        int leftRightDot = (5 * n - 2) - dotMiddle;
        int hashesMiddle = 5 * n - 2 * dotMiddle;
        int dot = 0;

        for (int row = 0; row < n / 2; row++) {
            System.out.print(repeatStr(".", n + row));
            System.out.print(repeatStr("#", 3 * n - 2 * row));
            System.out.println(repeatStr(".", n + row));
        }

        for (int row = 0; row < n / 2 + 1; row++) {

            System.out.print(repeatStr(".", leftRightDot / 2 + dot));
            System.out.print("#");
            System.out.print(repeatStr(".", dotMiddle));
            System.out.print("#");
            System.out.println(repeatStr(".", leftRightDot / 2 + dot));
            dot++;
            dotMiddle -= 2;
        }
        System.out.print(repeatStr(".", 2 * n));
        System.out.print(repeatStr("#", n));
        System.out.println(repeatStr(".", 2 * n));

        for (int row = 0; row < n / 2; row++) {
            System.out.print(repeatStr(".", 2 * n - 2));
            System.out.print(repeatStr("#", hashesMiddle));
            System.out.println(repeatStr(".", 2 * n - 2));
        }
        System.out.print(repeatStr(".", (5 * n - 10) / 2));
        System.out.print(repeatStr("D^A^N^C^E^", 1));
        System.out.println(repeatStr(".", (5 * n - 10) / 2));

        for (int row = 0; row < n / 2 + 1; row++) {
            System.out.print(repeatStr(".", 2 * n - 2));
            System.out.print(repeatStr("#", hashesMiddle));
            System.out.println(repeatStr(".", 2 * n - 2));
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

