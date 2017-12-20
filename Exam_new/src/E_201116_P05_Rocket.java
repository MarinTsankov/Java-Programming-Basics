import java.util.Scanner;

public class E_201116_P05_Rocket {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int width = 3 * n;

        for (int row = 0; row < n; row++) {
            System.out.printf("%S/%s\\%s%n", repeatStr(".", ((width - 2) / 2) - row), repeatStr(" ", 2 * row),
                    repeatStr(".", ((width - 2) / 2) - row));
        }
        System.out.printf("%s%s%s%n", repeatStr(".", n / 2), repeatStr("*", width - n), repeatStr(".", n / 2));
        for (int row = 0; row < 2 * n; row++) {
            System.out.printf("%s|%s|%s%n", repeatStr(".", n / 2), repeatStr("\\", width - n - 2), repeatStr(".", n / 2));
        }
        for (int row = 0; row < n / 2; row++) {
            System.out.printf("%s/%s\\%s%n", repeatStr(".", n / 2 - row), repeatStr("*", width - n - 2 + (2 * row)),
                    repeatStr(".", n / 2 - row));
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
