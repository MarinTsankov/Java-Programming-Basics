import java.util.Scanner;

public class P05_SquareFrame {


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        //First row
        System.out.print("+");
        for (int symbol = 0; symbol < n - 2; symbol++) {
            System.out.print(" -");
        }
        System.out.println(" +");

        //Middle row
        for (int row = 0; row < n - 2; row++) {
            System.out.print("|");
            for (int symbol = 0; symbol < n - 2; symbol++) {
                System.out.print(" -");
            }
            System.out.println(" |");
        }

        //Last row
        System.out.print("+");
        for (int symbol = 0; symbol < n - 2; symbol++) {
            System.out.print(" -");
        }
        System.out.println(" +");
    }
}


