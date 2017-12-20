import java.util.Scanner;

public class E_181216_P05_ChristmasHat {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int length = 4 * n + 1;

        System.out.printf("%s/|\\%s%n", repeatStr(".", (length - 3) / 2), repeatStr(".", (length - 3) / 2));
        System.out.printf("%s\\|/%s%n", repeatStr(".", (length - 3) / 2), repeatStr(".", (length - 3) / 2));

        for (int row = 0; row < n * 2; row++) {
            System.out.printf("%s*%s*%s*%s%n", repeatStr(".", ((length - 3) / 2) - row), repeatStr("-", row)
                    , repeatStr("-", row), repeatStr(".", ((length - 3) / 2) - row));
        }

        System.out.println(repeatStr("*", length));
        System.out.printf("%s*%n", repeatStr("*.", 2 * n));
        System.out.println(repeatStr("*", length));


    }


    static String repeatStr(String text, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb.toString();
    }

}
