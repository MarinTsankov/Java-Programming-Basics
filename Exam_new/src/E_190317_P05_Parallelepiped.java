import java.util.Scanner;

public class E_190317_P05_Parallelepiped {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int width = 3 * n + 1;
        int length = 4 * n + 4;

        System.out.printf("+%s+%s%n", repeatStr("~", (width - 2 - (2 * n + 1))), repeatStr(".", 2 * n + 1));

        for (int row = 0; row < 2 * n + 1; row++) {
            System.out.printf("|%s\\%s\\%s%n" +
                    "", repeatStr(".", row), repeatStr("~", (width - 2 - (2 * n + 1))), repeatStr(".", (2 * n) - row));
        }
        for (int row = 0; row < 2 * n + 1; row++) {
            System.out.printf("%s\\%s|%s|%n" +
                    "", repeatStr(".", row), repeatStr(".", (2 * n) - row), repeatStr("~", (width - 2 - (2 * n + 1))));
        }
        System.out.printf("%s+%s+%n", repeatStr(".", 2 * n + 1), repeatStr("~", (width - 2 - (2 * n + 1))));

    }


    static String repeatStr(String text, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb.toString();
    }

}