import java.util.Scanner;

public class P10_CheckPrime {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        boolean prime = true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                prime = false;
                break;
            }
        }
        if (!prime || n < 2) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");

        }
    }
}
