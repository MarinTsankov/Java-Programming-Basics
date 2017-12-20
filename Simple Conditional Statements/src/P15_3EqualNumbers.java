import java.util.Scanner;

public class P15_3EqualNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("yes");
        } else {

            System.out.println("no");
        }

    }
}
