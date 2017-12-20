import java.util.Scanner;

public class E1_190317_P05_Hourglass {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int length = 2 * n + 1;

        System.out.println(repeatStr("*", length));
        System.out.printf(".*%s*.%n", repeatStr(" ", length - 4));

        for (int row = 1; row <= n - 2; row++) {

            System.out.printf(".%s*%s*%s.%n", repeatStr(".", row), repeatStr("@", length - 4 - 2 * row), repeatStr(".", row));
        }
        System.out.printf("%s*%s%n", repeatStr(".", n), repeatStr(".", n));
        for (int row = 0; row < n - 2; row++) {

            System.out.printf("%s*%s@%s*%s%n", repeatStr(".", (n - 1) - row), repeatStr(" ", row), repeatStr(" ", row)
                    , repeatStr(".", (n - 1) - row));
        }
        System.out.printf(".*%s*.%n", repeatStr("@", length - 4));
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