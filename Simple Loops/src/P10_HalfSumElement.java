import java.util.Scanner;

public class P10_HalfSumElement {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sum = 0;
        int maxNumber = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(console.nextLine());
            sum = sum + currentNumber;
            if (currentNumber > maxNumber) {
                maxNumber = currentNumber;
            }

        }sum = sum - maxNumber;


        if (maxNumber == sum) {
            System.out.printf("Yes%nSum = %d", sum);
        } else {
            int difference = Math.abs(maxNumber - sum);
            System.out.printf("No%nDiff = %d",difference);
        }
    }


}

