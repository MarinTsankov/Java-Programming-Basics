import java.util.Scanner;

public class E1_201116_P05_Fox {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int width = 2 * n + 3;

        for (int row = 0; row < n; row++) {
            System.out.printf("*%s\\%s/%s*%n", repeatStr("*", row), repeatStr("-", width - 4 - (2 * row)), repeatStr("*", row));
        }
        for (int row = 0; row < n / 3; row++) {
            System.out.printf("|%s\\%s/%s|%n", repeatStr("*", n / 2 + row), repeatStr("*", n - 2 * row)
                    , repeatStr("*", n / 2 + row));
        }
        for (int row = 0; row < n; row++) {
            System.out.printf("-%s\\%s/%s-%n", repeatStr("-", row), repeatStr("*", width - 4 - (2 * row)), repeatStr("-", row));
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
