import java.util.Scanner;

public class E_190317_P04_Bills {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int months = Integer.parseInt(console.nextLine());
        double water = 20;
        double internet = 15;
        double others = 0;
        double allMonthsElectricity = 0;
        double allMonthsWater = months * water;
        double allMonthsInternet = months * internet;
        double allMonthsOthers = 0;

        for (int i = 0; i < months; i++) {
            double electricityBill = Double.parseDouble(console.nextLine());
            allMonthsElectricity += electricityBill;
            others = (electricityBill + water + internet) * (1 + 0.20);
            allMonthsOthers += others;
        }
        double average = (allMonthsElectricity + allMonthsInternet + allMonthsOthers + allMonthsWater) / months;
        System.out.printf("Electricity: %.2f lv%nWater: %.2f lv%nInternet: %.2f lv%nOther: %.2f lv%n" +
                "Average: %.2f lv", allMonthsElectricity, allMonthsWater, allMonthsInternet, allMonthsOthers, average);
    }
}
