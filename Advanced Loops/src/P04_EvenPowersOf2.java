import java.util.Scanner;

public class P04_EvenPowersOf2 {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());

        for (int i = 0; i <= n; i += 2) {
            System.out.println((int) Math.pow(2, i));
        }
    }
}
