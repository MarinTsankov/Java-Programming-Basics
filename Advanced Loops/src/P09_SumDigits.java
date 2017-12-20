import java.util.Scanner;

public class P09_SumDigits {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int result = 0;

        while (n != 0) {
            int temp = n % 10;
            result += temp;
            n = n / 10;

        }
        System.out.println(result);
    }
}
