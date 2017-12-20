import java.util.Scanner;

public class P08_Sunglasses {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int width = 5 * n;
        int height = n;
        int widthOfMonocle = 2 * n;
        int middleGap = n;


        int rowGap = -1;
        if (n % 2 == 0) {
            rowGap = (n / 2) - 1;
        } else {
            rowGap = n / 2;
        }
        for (int row = 0; row < height; row++) {
            System.out.print("*");
            if (row == 0 || row == height - 1) {
                System.out.print(repeatStr("*", widthOfMonocle - 2));
            } else {
                System.out.print(repeatStr("/", widthOfMonocle - 2));
            }
            System.out.print("*");

            if (rowGap == row) {
                System.out.print(repeatStr("|", middleGap));
            } else {
                System.out.print(repeatStr(" ", middleGap));
            }
            System.out.print("*");
            if (row == 0 || row == height - 1) {
                System.out.print(repeatStr("*", widthOfMonocle - 2));
            } else {
                System.out.print(repeatStr("/", widthOfMonocle - 2));
            }
            System.out.print("*");
            System.out.println();
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


