import java.util.Scanner;

public class E_051117_P05_Java {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int waves = (3 * n + 6) - 3 - (n - 1);

        for (int row = 0; row < n; row++) {
            System.out.print(repeatStr(" ", n));
            System.out.println(repeatStr("~ ", 3));
        }
        System.out.println(repeatStr("=", (3 * n + 6) - 1));

        for (int row = 0; row < n - 2; row++) {
            if (row == n / 2 - 1) {
                System.out.print("|");
                System.out.print(repeatStr("~", n));
                System.out.print("JAVA");
                System.out.print(repeatStr("~", n));
                System.out.print("|");
                System.out.print(repeatStr(" ", n - 1));
                System.out.println("|");
            } else {
                System.out.print("|");
                System.out.print(repeatStr("~", waves));
                System.out.print("|");
                System.out.print(repeatStr(" ", n - 1));
                System.out.println("|");
            }

        }
        System.out.println(repeatStr("=", (3 * n + 6) - 1));

        for (int row = 0; row < n; row++) {
            if (row == 0) {
                System.out.print(repeatStr(" ", 2 * row));
                System.out.print("\\");
                System.out.print(repeatStr("@", waves));
                System.out.println("/");

            } else {
                System.out.print(repeatStr(" ", row));
                System.out.print("\\");
                System.out.print(repeatStr("@", waves - 2 * row));
                System.out.println("/");
            }
        }
        System.out.println(repeatStr("=", (3 * n + 6) - n));
    }


    static String repeatStr(String text, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb.toString();
    }
}