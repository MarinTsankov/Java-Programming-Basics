import java.util.Scanner;

public class E_260316_P05_Butterfly {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int width = 2 * n - 1;

        for (int row = 1; row <= n - 2; row++) {
            if (row % 2 != 0) {
                System.out.printf("%s\\ /%s%n", repeatStr("*", n - 2), repeatStr("*", n - 2));
            } else {
                System.out.printf("%s\\ /%s%n", repeatStr("-", n - 2), repeatStr("-", n - 2));
            }
        }
        System.out.printf("%s@%s%n", repeatStr(" ", n - 1), repeatStr(" ", n - 1));
        for (int row = 1; row <= n - 2; row++) {
            if (row % 2 != 0) {
                System.out.printf("%s/ \\%s%n", repeatStr("*", n - 2), repeatStr("*", n - 2));
            } else {
                System.out.printf("%s/ \\%s%n", repeatStr("-", n - 2), repeatStr("-", n - 2));
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