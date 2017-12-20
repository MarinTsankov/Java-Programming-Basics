import java.util.Scanner;

public class P13_NumberPyramid {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int count = 0;
        int row = 0;


        while (true) {
            row++;
            for (int i = 1; i <= row; i++) {
                count++;
                System.out.print(count + " ");
                if (count == n) {
                    return;
                }
            }
            System.out.println();
        }
    }
}


