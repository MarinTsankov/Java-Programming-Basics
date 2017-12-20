import java.util.Scanner;

public class E_250617_P05_Triangle {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int hashes = 0;
        int middle = 0;
        int leftRightHashes = 0;


        for (int row = 0; row < n + 1; row++) {

            if (row == 0) {
                System.out.println(repeatStr("#", (4 * n) + 1));
            } else if (row == 1) {
                System.out.print(repeatStr(".", row));
                System.out.print(repeatStr("#", ((2 * n) - 1)));
                System.out.print(repeatStr(" ", 1));
                System.out.print(repeatStr("#", ((2 * n) - 1)));
                System.out.println(repeatStr(".", row));
            } else if (row == n / 2 + 1) {
                leftRightHashes = ((4 * n) + 1) - (2 * row) - 3 - (2 * ((n / 2) - 1));
                System.out.print(repeatStr(".", row));
                System.out.print(repeatStr("#", leftRightHashes / 2));
                System.out.print(repeatStr(" ", (n / 2) - 1));
                System.out.print("(@)");
                System.out.print(repeatStr(" ", (n / 2) - 1));
                System.out.print(repeatStr("#", leftRightHashes / 2));
                System.out.println(repeatStr(".", row));
                middle += 2;
                hashes -= 2;
            } else {
                middle += 2;
                hashes -= 2;
                System.out.print(repeatStr(".", row));
                System.out.print(repeatStr("#", ((2 * n) - 1) + hashes));
                System.out.print(repeatStr(" ", middle + 1));
                System.out.print(repeatStr("#", ((2 * n) - 1) + hashes));
                System.out.println(repeatStr(".", row));
            }
        }

        for (int row = 0; row < n; row++) {
            middle -= 2;
            System.out.print(repeatStr(".", (n + 1) + row));
            System.out.print(repeatStr("#", middle + 3));
            System.out.println(repeatStr(".", (n + 1) + row));
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
