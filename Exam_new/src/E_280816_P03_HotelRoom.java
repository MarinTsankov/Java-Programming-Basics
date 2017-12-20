import java.util.Scanner;

public class E_280816_P03_HotelRoom {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String month = console.nextLine().toLowerCase();
        int nights = Integer.parseInt(console.nextLine());
        double priceStudio = 0.0;
        double priceApartment = 0.0;

        if (month.equals("may") || month.equals("october")) {
            if (nights > 14) {
                priceStudio = nights * 50 * 0.70;
                priceApartment = nights * 65 * 0.90;
            } else if (nights > 7) {
                priceStudio = nights * 50 * 0.95;
                priceApartment = nights * 65;
            } else {
                priceStudio = nights * 50;
                priceApartment = nights * 65;
            }
        }
        if (month.equals("june") || month.equals("september")) {
            if (nights > 14) {
                priceStudio = nights * 75.20 * 0.80;
                priceApartment = nights * 68.70 * 0.90;
            } else {
                priceStudio = nights * 75.20;
                priceApartment = nights * 68.70;
            }
        }
        if (month.equals("july") || month.equals("august")) {
            priceStudio = nights * 76;
            if (nights > 14) {
                priceApartment = nights * 77 * 0.90;
            } else {
                priceApartment = nights * 77;

            }
        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", priceApartment, priceStudio);
    }
}
