import java.util.Scanner;

public class P07_ChristmasTree {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print(" ");
        }
        System.out.println(" | ");
        for (int row = 0; row < n; row++) {
            for (int space = 0; space < n - 1 - row; space++) {
                System.out.print(" ");
            }
            for (int asterisk = 0; asterisk < row + 1; asterisk++) {
                System.out.print("*");
            }
            System.out.print(" | ");
            for (int asterisk = 0; asterisk < row + 1; asterisk++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
















