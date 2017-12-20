import java.util.Scanner;

public class E_030917_P05_Snowflake {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int row = 0; row < n - 1; row++) {
            if (row == 0) {
                System.out.print(repeatStr(".", row));
                System.out.print("*");
                System.out.print(repeatStr(".", n));
                System.out.print("*");
                System.out.print(repeatStr(".", n));
                System.out.print("*");
                System.out.println(repeatStr(".", row));
            } else {
                System.out.print(repeatStr(".", row));
                System.out.print("*");
                System.out.print(repeatStr(".", n - row));
                System.out.print("*");
                System.out.print(repeatStr(".", n - row));
                System.out.print("*");
                System.out.println(repeatStr(".", row));
            }
        }
        System.out.print(repeatStr(".", (2 * n - 2) / 2));
        System.out.print(repeatStr("*", 5));
        System.out.println(repeatStr(".", (2 * n - 2) / 2));
        System.out.println(repeatStr("*", 2 * n + 3));
        System.out.print(repeatStr(".", (2 * n - 2) / 2));
        System.out.print(repeatStr("*", 5));
        System.out.println(repeatStr(".", (2 * n - 2) / 2));

        for (int row = 0; row < n - 1; row++) {
            if (row == 0) {
                System.out.print(repeatStr(".", (2 * n - 4) / 2));
                System.out.print("*");
                System.out.print(repeatStr(".", 2));
                System.out.print("*");
                System.out.print(repeatStr(".", 2));
                System.out.print("*");
                System.out.println(repeatStr(".", (2 * n - 4) / 2));
            } else {
                System.out.print(repeatStr(".", (2 * n - 4) / 2 - row));
                System.out.print("*");
                System.out.print(repeatStr(".", 2 + row));
                System.out.print("*");
                System.out.print(repeatStr(".", 2 + row));
                System.out.print("*");
                System.out.println(repeatStr(".", (2 * n - 4) / 2 - row));
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
