import java.util.Scanner;


public class E_161217_P03_SantasHoliday {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        int daysOfStay = Integer.parseInt(console.nextLine());
        String roomType = console.nextLine().toLowerCase();
        String evaluation = console.nextLine();
        double roomForOnePersonPrice = 18.00;
        double apartmentPrice = 25.00;
        double presidentApartmentPrice = 35.00;
        double price = 0;

        int nightsOfStay = daysOfStay - 1;

        if (roomType.equals("room for one person")) {
            price = nightsOfStay * roomForOnePersonPrice;
        }
        if (roomType.equals("apartment")) {
            price = nightsOfStay * apartmentPrice;
            if (daysOfStay < 10) {
                price *= (1 - 0.30);
            }
            if (daysOfStay >= 10 && daysOfStay <= 15) {
                price *= (1 - 0.35);
            }
            if (daysOfStay > 15) {
                price *= (1 - 0.50);
            }
        }
        if (roomType.equals("president apartment")) {
            price = nightsOfStay * presidentApartmentPrice;
            if (daysOfStay < 10) {
                price *= (1 - 0.10);
            }
            if (daysOfStay >= 10 && daysOfStay <= 15) {
                price *= (1 - 0.15);
            }
            if (daysOfStay > 15) {
                price *= (1 - 0.20);
            }
        }

        if (evaluation.equals("positive")) {
            price *= (1 + 0.25);

        } else {
            price *= (1 - 0.10);
        }

        System.out.printf("%.2f",price);
    }
}
