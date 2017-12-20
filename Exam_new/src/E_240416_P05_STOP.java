import java.util.Scanner;

public class E_240416_P05_STOP {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        System.out.printf("%s%s%s%n", repeatStr(".", n + 1), repeatStr("_", 2 * n + 1), repeatStr(".", n + 1));

        for (int row = 0; row < n; row++) {
            System.out.printf("%s//%s\\\\%s%n", repeatStr(".", n - row), repeatStr("_", 2 * n - 1 + 2 * row),
                    repeatStr(".", n - row));
        }
        System.out.printf("//%sSTOP!%s\\\\%n", repeatStr("_", 2 * n - 3), repeatStr("_", 2 * n - 3));

        for (int row = 0; row < n; row++) {
            System.out.printf("%s\\\\%s//%s%n", repeatStr(".", row), repeatStr("_", 4 * n - 1 - 2 * row), repeatStr(".", row));

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
