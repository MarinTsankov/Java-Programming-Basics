import java.util.Scanner;

public class P03_PowersOfTwo {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int num = 1;

        System.out.println(num);
        for (int i = 1; i <= n; i++) {
            num = num * 2;

            System.out.println(num);

        }
    }
}
