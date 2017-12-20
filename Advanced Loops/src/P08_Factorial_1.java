import java.util.Scanner;

public class P08_Factorial_1 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int result = 1;

        while (n > 0) {
            result *= n;
            n--;
        }
        System.out.println(result);
    }
}
