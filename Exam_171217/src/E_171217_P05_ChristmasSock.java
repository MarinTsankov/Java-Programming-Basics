import java.util.Scanner;

public class E_171217_P05_ChristmasSock {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());


        System.out.printf("|%s|%n", repeatStr("-", 2 * n));
        System.out.printf("|%s|%n", repeatStr("*", 2 * n));
        System.out.printf("|%s|%n", repeatStr("-", 2 * n));

        for (int row = 0; row < n - 1; row++) {
            System.out.printf("|%s%s%s|%n", repeatStr("-", n - 1 - row), repeatStr("~", 2 + (2 * row)),
                    repeatStr("-", n - 1 - row));
        }
        for (int row = 0; row < n - 2; row++) {
            System.out.printf("|%s%s%s|%n", repeatStr("-", 2 + row), repeatStr("~", (2 * n - 4) - (2 * row)),
                    repeatStr("-", 2 + row));
        }
        for (int row = 0; row < n + 3; row++) {
            if (row == n / 2) {
                System.out.printf("%s\\%sMERRY%s\\%n", repeatStr("-", row), repeatStr(".", ((2 * n + 1) - 5) / 2),
                        repeatStr(".", ((2 * n + 1) - 5) / 2));
            } else if (row == n / 2 + 2) {
                System.out.printf("%s\\%sX-MAS%s\\%n", repeatStr("-", row), repeatStr(".", ((2 * n + 1) - 5) / 2),
                        repeatStr(".", ((2 * n + 1) - 5) / 2));
            } else if (row == n + 2) {
                System.out.printf("%s\\%s)", repeatStr("-", row), repeatStr("_", 2 * n + 1));
            } else {
                System.out.printf("%s\\%s\\%n", repeatStr("-", row), repeatStr(".", 2 * n + 1));
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
