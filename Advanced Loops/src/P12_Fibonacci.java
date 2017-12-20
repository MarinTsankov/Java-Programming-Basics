import java.util.Scanner;

public class P12_Fibonacci {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int f0 = 1;
        int f1 = 1;


        for (int i = 2; i <= n; i++) {
            int temp = f0 + f1;
            f0 = f1;
            f1 = temp;

        }
        System.out.println(f1);
    }
}

