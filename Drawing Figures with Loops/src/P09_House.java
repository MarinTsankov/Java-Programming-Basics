import java.util.Scanner;

public class P09_House {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        int roofHeight = -1;
        boolean isEven = n % 2 == 0;

        if (isEven) {
            roofHeight = n / 2;
        } else {
            roofHeight = n / 2 + 1;
        }
        for (int row = 0; row < roofHeight; row++) {
            int dashes = -1;
            int asterisk = -1;
            if (isEven) {
                dashes = n / 2 - 1;
                asterisk = 2;
            } else {
                dashes = n / 2;
                asterisk = 1;
            }
            System.out.print(repeatStr("-", dashes - row));
            System.out.print(repeatStr("*", asterisk + row * 2));
            System.out.println(repeatStr("-", dashes-row));

            }
            for (int i = 0; i < n-roofHeight; i++) {
                System.out.print("|");
                System.out.print(repeatStr("*", n - 2));
                System.out.println("|");
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