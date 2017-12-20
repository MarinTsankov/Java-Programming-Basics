import java.util.Scanner;

public class P07_GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());

        while (a % b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
            System.out.println(b);
    }
}

