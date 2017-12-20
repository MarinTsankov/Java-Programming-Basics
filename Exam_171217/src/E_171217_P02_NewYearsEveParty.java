import java.util.Scanner;

public class E_171217_P02_NewYearsEveParty {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int guestsCount = Integer.parseInt(console.nextLine());
        int budget = Integer.parseInt(console.nextLine());

        double moneyForFireworks = 0;
        double moneyForDonation = 0;

        int moneyCollected = guestsCount * 20;

        if (moneyCollected < budget) {
            int remainingMoney = budget - moneyCollected;
            moneyForFireworks = remainingMoney * 0.40;
            moneyForDonation = remainingMoney - moneyForFireworks;
            System.out.printf("Yes! %.0f lv are for fireworks and %.0f lv are for donation.",
                    moneyForFireworks, moneyForDonation);
        } else {
            System.out.printf("They won't have enough money to pay the covert. They will need %d lv more.", moneyCollected - budget);
        }


    }
}
