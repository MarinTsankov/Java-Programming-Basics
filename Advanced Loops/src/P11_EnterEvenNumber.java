import java.util.Scanner;

public class P11_EnterEvenNumber {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = 0;

        while (true) {
            try {
                System.out.println("Enter even number: ");
                n = Integer.parseInt(console.nextLine());
                if (n % 2 == 0)
                    break;
                System.out.println("The number is not even.");

            } catch (Exception ex) {
                System.out.println("Invalid number!");
            }
        }
        System.out.println("Even number entered: " + n);
    }
}
