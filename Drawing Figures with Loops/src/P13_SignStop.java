import java.util.Scanner;

public class P13_SignStop {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int N = Integer.parseInt(console.nextLine());
        int leftRightDashes = (4 * N + 3) - 9;
        int dashes = 0;

        for (int row = 0; row < N + 2; row++) {
            if (row == 0) {
                System.out.print(repeatStr(".", N + 1));
                System.out.print(repeatStr("_", 2 * N + 1));
                System.out.println(repeatStr(".", N + 1));
            } else if (row == 1) {
                System.out.print(repeatStr(".", N + 1 - row));
                System.out.print(repeatStr("/", 2));
                System.out.print(repeatStr("_", 2 * N - 1));
                System.out.print(repeatStr("\\", 2));
                System.out.println(repeatStr(".", N + 1 - row));

            } else if (row == 2 || row < N + 1) {
                System.out.print(repeatStr(".", N + 1 - row));
                System.out.print(repeatStr("/", 2));
                System.out.print(repeatStr("_", 2 * N + 1 + dashes));
                System.out.print(repeatStr("\\", 2));
                System.out.println(repeatStr(".", N + 1 - row));
                dashes += 2;

            } else {

                System.out.print(repeatStr(".", N + 1 - row));
                System.out.print(repeatStr("/", 2));
                System.out.print(repeatStr("_", leftRightDashes / 2));
                System.out.print(repeatStr("STOP!", 1));
                System.out.print(repeatStr("_", leftRightDashes / 2));
                System.out.print(repeatStr("\\", 2));
                System.out.println(repeatStr(".", N + 1 - row));
            }
        }
        dashes = 2;
        System.out.print(repeatStr("\\", 2));
        System.out.print(repeatStr("_", 4 * N - 1));
        System.out.println(repeatStr("/", 2));


        for (int row = 0; row < N - 1; row++) {
            if (row == 0) {
                System.out.print(repeatStr(".", row + 1));
                System.out.print(repeatStr("\\", 2));
                System.out.print(repeatStr("_", 4 * N - 3));
                System.out.print(repeatStr("/", 2));
                System.out.println(repeatStr(".", row + 1));

            } else {
                System.out.print(repeatStr(".", row + 1));
                System.out.print(repeatStr("\\", 2));
                System.out.print(repeatStr("_", 4 * N - 3 - dashes));
                System.out.print(repeatStr("/", 2));
                System.out.println(repeatStr(".", row + 1));
                dashes += 2;
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
