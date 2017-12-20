import java.util.Scanner;

public class P12_EqualPairs {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int currentSum = 0;
        int previousSum = 0;


        for (int i = 0; i < n; i++) {
            int number1 = Integer.parseInt(console.nextLine());
            int number2 = Integer.parseInt(console.nextLine());
            if (i == 0) {
                previousSum = number1 + number2;
            } else {
                currentSum = number1 + number2;
                currentSum = currentSum - previousSum;
            }

            System.out.println(currentSum);
        }

    }
}



