import java.util.Scanner;

public class E_170917_P05_Sheriff {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int dots = 0;
        int x = 0;

        for (int row = 0; row <= 3; row++) {
            if (row == 0) {
                System.out.print(repeatStr(".", (3 * n - 1) / 2));
                System.out.print("x");
                System.out.println(repeatStr(".", (3 * n - 1) / 2));
            } else if (row == 1 || row == (2 * n + 8) / 2 - 1) {
                System.out.print(repeatStr(".", (3 * n - 1) / 2 - 1));
                System.out.print("/");
                System.out.print("x");
                System.out.print("\\");
                System.out.println(repeatStr(".", (3 * n - 1) / 2 - 1));
            } else if (row == 2) {
                System.out.print(repeatStr(".", (3 * n - 3) / 2));
                System.out.print("x");
                System.out.print("|");
                System.out.print("x");
                System.out.println(repeatStr(".", (3 * n - 3) / 2));
            }
        }
        for (int row = 0; row < (n - 1) / 2; row++) {
            System.out.print(repeatStr(".", ((3 * n - (2 * n + 1)) / 2) + dots));
            System.out.print(repeatStr("x", n + x));
            System.out.print("|");
            System.out.print(repeatStr("x", n + x));
            System.out.println(repeatStr(".", ((3 * n - (2 * n + 1)) / 2) + dots));
            dots--;
            x++;
        }

        for (int row = 0; row < (n - 1) / 2 + 1; row++) {
            System.out.print(repeatStr(".", ((3 * n - (2 * n + 1)) / 2) + dots));
            System.out.print(repeatStr("x", n + x));
            System.out.print("|");
            System.out.print(repeatStr("x", n + x));
            System.out.println(repeatStr(".", ((3 * n - (2 * n + 1)) / 2) + dots));
            dots++;
            x--;
        }
        System.out.print(repeatStr(".", (3 * n - 1) / 2 - 1));
        System.out.print("/");
        System.out.print("x");
        System.out.print("\\");
        System.out.println(repeatStr(".", (3 * n - 1) / 2 - 1));
        System.out.print(repeatStr(".", (3 * n - 1) / 2 - 1));
        System.out.print("\\");
        System.out.print("x");
        System.out.print("/");
        System.out.println(repeatStr(".", (3 * n - 1) / 2 - 1));
        dots = 0;
        x = 0;

        for (int row = 0; row < (n - 1) / 2; row++) {
            System.out.print(repeatStr(".", ((3 * n - (2 * n + 1)) / 2) + dots));
            System.out.print(repeatStr("x", n + x));
            System.out.print("|");
            System.out.print(repeatStr("x", n + x));
            System.out.println(repeatStr(".", ((3 * n - (2 * n + 1)) / 2) + dots));
            dots--;
            x++;
        }

        for (int row = 0; row < (n - 1) / 2 + 1; row++) {
            System.out.print(repeatStr(".", ((3 * n - (2 * n + 1)) / 2) + dots));
            System.out.print(repeatStr("x", n + x));
            System.out.print("|");
            System.out.print(repeatStr("x", n + x));
            System.out.println(repeatStr(".", ((3 * n - (2 * n + 1)) / 2) + dots));
            dots++;
            x--;
        }

        for (int row = 0; row <= 3; row++) {
            if (row == 0) {
                System.out.print(repeatStr(".", (3 * n - 3) / 2));
                System.out.print("x");
                System.out.print("|");
                System.out.print("x");
                System.out.println(repeatStr(".", (3 * n - 3) / 2));
            } else if (row == 1) {
                System.out.print(repeatStr(".", (3 * n - 1) / 2 - 1));
                System.out.print("\\");
                System.out.print("x");
                System.out.print("/");
                System.out.println(repeatStr(".", (3 * n - 1) / 2 - 1));
            } else if (row == 2) {
                System.out.print(repeatStr(".", (3 * n - 1) / 2));
                System.out.print("x");
                System.out.println(repeatStr(".", (3 * n - 1) / 2));
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
