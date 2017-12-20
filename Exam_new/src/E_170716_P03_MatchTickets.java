import java.util.Scanner;

public class E_170716_P03_MatchTickets {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double budget = Double.parseDouble(console.nextLine());
        String category = console.nextLine();
        double peopleCount = Double.parseDouble(console.nextLine());
        double transportPrice = 0.0;
        double VIP = 499.99;
        double normal = 249.99;
        double temp = budget;
        double ticketsPrice = 0;

        if (peopleCount >= 1 && peopleCount <= 4) {
            transportPrice = temp * (1 - 0.75);
        } else if (peopleCount >= 5 && peopleCount <= 9) {
            transportPrice = temp * (1 - 0.60);
        } else if (peopleCount >= 10 && peopleCount <= 24) {
            transportPrice = temp * (1 - 0.50);
        } else if (peopleCount >= 25 && peopleCount <= 49) {
            transportPrice = temp * (1 - 0.40);
        } else if (peopleCount >= 50) {
            transportPrice = temp * (1 - 0.25);
        }
        temp = transportPrice;
        if (category.equals("VIP")) {
            ticketsPrice = VIP * peopleCount;
            if (temp >= ticketsPrice) {
                System.out.printf("Yes! You have %.2f leva left.", temp - ticketsPrice);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", ticketsPrice - temp);
            }
        }
        if (category.equals("Normal")) {
            ticketsPrice = normal * peopleCount;
            if (temp >= ticketsPrice) {
                System.out.printf("Yes! You have %.2f leva left.", temp - ticketsPrice);
            } else {
                System.out.printf("Not enough money! You need %.2f leva.", ticketsPrice - temp);
            }
        }
    }
}
