import java.util.Scanner;

public class P12_Butterfly {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int row = 0; row < n - 2; row++) {
            if (row % 2 == 0) {
                System.out.print(repeatStr("*", n - 2));
                System.out.print("\\");
                System.out.print(" ");
                System.out.print("/");
                System.out.println(repeatStr("*", n - 2));
            } else {
                System.out.print(repeatStr("-", n - 2));
                System.out.print("\\");
                System.out.print(" ");
                System.out.print("/");
                System.out.println(repeatStr("-", n - 2));
            }
        }

        System.out.print(repeatStr(" ", n - 1));
        System.out.print("@");
        System.out.println(repeatStr(" ", n - 1));
        for (int row = 0; row < n - 2; row++) {
            if (row % 2 == 0) {
                System.out.print(repeatStr("*", n - 2));
                System.out.print("/");
                System.out.print(" ");
                System.out.print("\\");
                System.out.println(repeatStr("*", n - 2));
            } else {
                System.out.print(repeatStr("-", n - 2));
                System.out.print("/");
                System.out.print(" ");
                System.out.print("\\");
                System.out.println(repeatStr("-", n - 2));
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