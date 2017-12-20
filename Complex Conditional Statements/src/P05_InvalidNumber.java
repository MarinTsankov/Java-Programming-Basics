import java.util.Scanner;

public class P05_InvalidNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int num = Integer.parseInt(console.nextLine());
        int b = 0;

        boolean isValid = num >= 100 && num <= 200 || num == b;
        if (!isValid) {
            System.out.println("invalid");
        }

    }
}
