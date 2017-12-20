import java.util.Scanner;

public class P14_NumberTable {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());


        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int num = row + col + 1;
                if (num > n) {
                    System.out.print(2 * n - num + " ");
                } else {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }
    }
}

