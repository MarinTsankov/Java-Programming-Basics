import java.util.Scanner;

public class E_170716_P05_Diamond {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int width = 5 * n;

        System.out.printf("%s%s%s%n", repeatStr(".", n), repeatStr("*", width - 2 * n), repeatStr(".", n));
        for (int row = 0; row < n - 1; row++) {
            System.out.printf("%s*%s*%s%n", repeatStr(".", n - 1 - row), repeatStr(".", width - 2 * n + 2 * row),
                    repeatStr(".", n - 1 - row));
        }
        System.out.println(repeatStr("*", width));
        for (int row = 0; row < 2 * n + 1; row++) {

            if (row == 2 * n ) {
                System.out.printf("%s*%s*%s%n", repeatStr(".", 1 + row), repeatStr("*", width - 4 - 2 * row),
                        repeatStr(".", 1 + row));
                break;
            }
            System.out.printf("%s*%s*%s%n", repeatStr(".", 1 + row), repeatStr(".", width - 4 - 2 * row),
                    repeatStr(".", 1 + row));

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

