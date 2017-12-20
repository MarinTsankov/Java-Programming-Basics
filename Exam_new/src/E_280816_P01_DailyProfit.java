import java.util.Scanner;

public class E_280816_P01_DailyProfit {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int workingDaysInMonth = Integer.parseInt(console.nextLine());
        double earnedMoneyPerDay = Double.parseDouble(console.nextLine());
        double dollarRate = Double.parseDouble(console.nextLine());

        double earnedMoneyPerYear = earnedMoneyPerDay * workingDaysInMonth;
        double bonus = earnedMoneyPerYear * 2.5;
        double totalEarnedMoney = (earnedMoneyPerYear * 12) + bonus;
        double withoutCosts = totalEarnedMoney * (1 - 0.25);

        double averageEarnedMoneyPerDay = withoutCosts / 365;

        System.out.printf("%.2f", averageEarnedMoneyPerDay * dollarRate);


    }
}
