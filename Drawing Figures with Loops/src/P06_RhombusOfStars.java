import java.util.Scanner;

public class P06_RhombusOfStars {

    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int row = 0; row < n; row++) {
            System.out.print(repeatStr(n - 1 - row, " "));
            System.out.print(repeatStr(row + 1, "* "));
            System.out.println();
        }

        for (int i = 0; i < n - 1; i++) {
            System.out.print(repeatStr(i + 1, " "));
            System.out.print(repeatStr(n - 1 - i, "* "));
            System.out.println();
        }

    }


    static String repeatStr(int count, String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(text);
        }
        return sb.toString();
    }
}
