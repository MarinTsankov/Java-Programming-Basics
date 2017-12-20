import java.util.Scanner;

public class E_060316_P05_DrawFort {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        int n = Integer.parseInt(console.nextLine());
        int width = 2 * n;
        if (n < 4) {
            System.out.printf("/%s\\/%s\\%n", repeatStr("^", n / 2), repeatStr("^", n / 2));
        } else if (n > 4 && n % 2 != 0) {
            System.out.printf("/%s\\%s/%s\\%n", repeatStr("^", n / 2), repeatStr("_", width - 4 - n + 1),
                    repeatStr("^", n / 2));
        } else {
            System.out.printf("/%s\\%s/%s\\%n", repeatStr("^", n / 2), repeatStr("_", width - 4 - n),
                    repeatStr("^", n / 2));
        }
        for (int row = 0; row < n - 2; row++) {
            if (row == n - 3 && n > 4 && n % 2 == 0) {
                System.out.printf("|%s%s%s|%n", repeatStr(" ", n / 2 + 1),
                        repeatStr("_", width - 4 - n), repeatStr(" ", n / 2 + 1));
            } else if (row == n - 3 && n > 4 && n % 2 != 0) {
                System.out.printf("|%s%s%s|%n", repeatStr(" ", n / 2 + 1),
                        repeatStr("_", width - 4 - n + 1), repeatStr(" ", n / 2 + 1));
            } else {
                System.out.printf("|%s|%n", repeatStr(" ", width - 2));
            }
        }
        if (n < 4) {
            System.out.printf("\\%s/\\%s/%n", repeatStr("_", n / 2), repeatStr("_", n / 2));
        } else if (n > 4 && n % 2 != 0) {
            System.out.printf("\\%s/%s\\%s/%n", repeatStr("_", n / 2), repeatStr(" ", width - 4 - n + 1),
                    repeatStr("_", n / 2));
        } else {
            System.out.printf("\\%s/%s\\%s/%n", repeatStr("_", n / 2), repeatStr(" ", width - 4 - n),
                    repeatStr("_", n / 2));
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
