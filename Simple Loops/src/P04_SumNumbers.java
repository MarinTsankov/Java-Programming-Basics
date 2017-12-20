import java.util.Scanner;

public class P04_SumNumbers {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());

        int sum = 0;

        for (int i = 0; i < num; i++) {
            int n = Integer.parseInt(console.nextLine());
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
