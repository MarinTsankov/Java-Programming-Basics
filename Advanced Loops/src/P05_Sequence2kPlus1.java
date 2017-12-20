import java.util.Scanner;

public class P05_Sequence2kPlus1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int num = 1;

        System.out.println(num);
        while (num <= n) {

            num = num * 2 + 1;

            if (num > n) {
                break;
            }
            System.out.println(num);
        }
    }
}
