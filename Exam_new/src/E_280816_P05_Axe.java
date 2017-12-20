import java.util.Scanner;

public class E_280816_P05_Axe {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int width = 5 * n;

        for (int row = 0; row < n; row++) {
            System.out.printf("%s*%s*%s%n", repeatStr("-", 3 * n), repeatStr("-", row), repeatStr("-", 2 * n - 2 - row));
        }
        for (int row = 0; row < n / 2; row++) {
            System.out.printf("%s*%s*%s%n", repeatStr("*", 3 * n), repeatStr("-", n - 1), repeatStr("-", n - 1));
        }

        for (int row = 0; row < n / 2 - 1; row++) {
            System.out.printf("%s*%s*%s%n", repeatStr("-", 3 * n - row), repeatStr("-", n - 1 + (2 * row)),
                    repeatStr("-", n - 1 - row));
        }
        if (n % 2 == 0) {
            System.out.printf("%s*%s*%s", repeatStr("-", (5 * n) / 2 + 1),
                    repeatStr("*", (2 * n) - 3), repeatStr("-", n / 2));
        } else {
            System.out.printf("%s*%s*%s", repeatStr("-", (5 * n) / 2 + 2), repeatStr("*", (2 * n) - 4), repeatStr("-", n / 2 + 1));
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