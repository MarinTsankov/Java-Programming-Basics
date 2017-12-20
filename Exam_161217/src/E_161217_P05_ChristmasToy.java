import java.util.Scanner;

public class E_161217_P05_ChristmasToy {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int width = 5 * n;

        System.out.printf("%s%s%s%n", repeatStr("-", 2 * n), repeatStr("*", n), repeatStr("-", 2 * n));

        for (int row = 0; row < n / 2; row++) {
            System.out.printf("%s*%s%s*%s%s%n", repeatStr("-", 2 * n - 2 - (2 * row)), repeatStr("*", row),
                    repeatStr("&", (n + 2 + 2 * row)), repeatStr("*", row),
                    repeatStr("-", 2 * n - 2 - (2 * row)));
        }
        for (int row = 0; row < n / 2; row++) {
            System.out.printf("%s**%s**%s%n", repeatStr("-", n - 1 - row),
                    repeatStr("~", (width - (2 * (n - 1)) - 4) + 2 * row),
                    repeatStr("-", n - 1 - row));
        }
        System.out.printf("%s*%s*%s%n", repeatStr("-", n / 2), repeatStr("|", width - n - 2), repeatStr("-", n / 2));

        for (int row = 0; row < n / 2; row++) {
            System.out.printf("%s**%s**%s%n", repeatStr("-", n / 2 + row),
                    repeatStr("~", (width - n - 4) - 2 * row),
                    repeatStr("-", n / 2 + row));
        }
        for (int row = 0; row < n / 2; row++) {
            System.out.printf("%s%s%s%s%s%n", repeatStr("-", n + (2 * row)), repeatStr("*", n / 2 - row),
                    repeatStr("&", (2 * n - 2 * row)), repeatStr("*", n / 2 - row),
                    repeatStr("-", n + (2 * row)));
        }
        System.out.printf("%s%s%s%n", repeatStr("-", 2 * n), repeatStr("*", n), repeatStr("-", 2 * n));
    }

    static String repeatStr(String text, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb.toString();
    }
}
