import java.util.Scanner;

public class E_240416_P04_SmartLili {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int lilisAge = Integer.parseInt(console.nextLine());
        double washingMachinePrice = Double.parseDouble(console.nextLine());
        double singleToyPrice = Integer.parseInt(console.nextLine());
        int toys = 0;
        double money = 0;
        int brother = 0;
        double temp = 0;

        for (int i = 1; i <= lilisAge; i++) {
            if (i % 2 != 0) {
                toys++;
            } else {
                temp += 10;
                money += temp;
                brother++;

            }
        }
        double moneyFromToys = toys * singleToyPrice;
        double totalMoney = money + moneyFromToys - brother;
        if (washingMachinePrice > totalMoney) {
            System.out.printf("No! %.2f", washingMachinePrice - totalMoney);
        } else {
            System.out.printf("Yes! %.2f", totalMoney - washingMachinePrice);
        }


    }
}
