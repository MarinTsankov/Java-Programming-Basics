import java.util.Scanner;

public class P11_DrawFort {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int widthOfFort = 2 * n;
        int heightOfFort = n;
        int midSum = n * 2 - 4 - 2 * (n/2);
        boolean isHigher = n > 4;


        if (!isHigher) {
            System.out.print("/");
            System.out.print(repeatStr("^", n / 2));
            System.out.print("\\");
            System.out.print("/");
            System.out.print(repeatStr("^", n / 2));
            System.out.println("\\");
        } else {
            System.out.print("/");
            System.out.print(repeatStr("^", n / 2));
            System.out.print("\\");
            System.out.print(repeatStr("_", midSum));
            System.out.print("/");
            System.out.print(repeatStr("^", n / 2));
            System.out.println("\\");
        }


        for (int row = 1; row < n - 1; row++) {
            if (isHigher) {
                if (row == n - 2) {
                    System.out.print("|");
                    System.out.print(repeatStr(" ", n / 2 + 1));
                    System.out.print(repeatStr("_", midSum));
                    System.out.print(repeatStr(" ", n / 2 + 1));
                    System.out.println("|");
                } else {
                    System.out.print("|");
                    System.out.print(repeatStr(" ", widthOfFort - 2));
                    System.out.println("|");
                }
            } else {
                System.out.print("|");
                System.out.print(repeatStr(" ", widthOfFort - 2));
                System.out.println("|");
            }
        }

        if (!isHigher) {
            System.out.print("\\");
            System.out.print(repeatStr("_", n / 2));
            System.out.print("/");
            System.out.print("\\");
            System.out.print(repeatStr("_", n / 2));
            System.out.print("/");
        } else {
            System.out.print("\\");
            System.out.print(repeatStr("_", n / 2));
            System.out.print("/");
            System.out.print(repeatStr(" ", midSum));
            System.out.print("\\");
            System.out.print(repeatStr("_", n / 2));
            System.out.print("/");
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
