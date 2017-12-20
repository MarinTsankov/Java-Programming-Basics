import java.util.Scanner;

public class E_070517_P05_Crown {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int width = (2 * n) - 1;
        int heigth = (n / 2) + 4;


        System.out.printf("@%s@%s@%n", repeatStr(" ", n - 2), repeatStr(" ", n - 2));
        System.out.printf("**%s*%s**%n", repeatStr(" ", n - 3), repeatStr(" ", n - 3));

        for (int row = 0; row < n / 2 - 1; row++) {
            if (row == n / 2 - 2) {
                System.out.printf("*%s*%s%s%s*%s*%n", repeatStr(".", row + 1), repeatStr(" ", n - 5 - 2 * row),
                        repeatStr(".", 2 * row + 1), repeatStr(" ", n - 5 - 2 * row), repeatStr(".", row + 1));
                break;
            }
            System.out.printf("*%s*%s*%s*%s*%s*%n", repeatStr(".", row + 1), repeatStr(" ", n - 5 - 2 * row),
                    repeatStr(".", 2 * row + 1), repeatStr(" ", n - 5 - 2 * row), repeatStr(".", row + 1));
        }
        System.out.printf("*%s%s.%s%s*%n", repeatStr(".", n / 2), repeatStr("*", n / 2 - 2), repeatStr("*", n / 2 - 2),
                repeatStr(".", n / 2));
        System.out.println(repeatStr("*", width));
        System.out.println(repeatStr("*", width));
    }


    static String repeatStr(String text, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb.toString();
    }
}
