import java.util.Scanner;

public class P08_Factorial {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println(result);
    }
}
