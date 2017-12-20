import java.util.Scanner;

public class E_250617_P04_MoneyPrize {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double parts = Double.parseDouble(console.nextLine());
        double rewardPerPoint = Double.parseDouble(console.nextLine());
        double priceEven = 0;
        double priceOdd = 0;
        double bonus = 2;
        double totalPrice = 0;
        double reward = 0;

        for (int i = 1; i < parts + 1; i++) {
            double points = Double.parseDouble(console.nextLine());
            if (i % 2 == 0) {
                points = points * bonus;
                priceEven += points;
            } else {
                priceOdd += points;
            }

        }
        totalPrice = priceEven + priceOdd;
        reward = totalPrice * rewardPerPoint;
        System.out.printf("The project prize was %.2f lv.", reward);

    }
}
