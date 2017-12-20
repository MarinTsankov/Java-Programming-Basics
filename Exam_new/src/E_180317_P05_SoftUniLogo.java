import java.util.Scanner;

public class E_180317_P05_SoftUniLogo {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int length = 12 * n - 5;

        for (int row = 0; row < 2 * n; row++) {

            System.out.printf("%s%s%s%n", repeatStr(".", ((6 * n) - 3) - (3 * row))
                    , repeatStr("#", (1 + 2 * (3 * row)))
                    , repeatStr(".", ((6 * n) - 3) - (3 * row)));
        }
        for (int row = 0; row <= n - 2; row++) {

            System.out.printf("|..%s%s%s...%n", repeatStr(".", 3 * row), repeatStr("#", (length - 6) - (2 * (3 * row)))
                    , repeatStr(".", 3 * row));
        }
        for (int row = 0; row < n - 2; row++) {

            System.out.printf("|%s%s%s%n", repeatStr(".", (((6 * n - 5) / 2) - 1)), repeatStr("#", 6 * n + 1)
                    , repeatStr(".", ((6 * n - 5) / 2)));

        }
        System.out.printf("@%s%s%s%n", repeatStr(".", (((6 * n - 5) / 2) - 1)), repeatStr("#", 6 * n + 1)
                , repeatStr(".", ((6 * n - 5) / 2)));


    }

    static String repeatStr(String text, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb.toString();
    }

}
