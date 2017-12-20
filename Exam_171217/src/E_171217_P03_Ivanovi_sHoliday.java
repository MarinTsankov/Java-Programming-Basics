import java.util.Scanner;

public class E_171217_P03_Ivanovi_sHoliday {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int nightsCount = Integer.parseInt(console.nextLine());
        String destination = console.nextLine().toLowerCase();
        String transport = console.nextLine().toLowerCase();

        double price = 0;
        double total = 0;

        if (destination.equals("miami")) {
            if (nightsCount >= 1 && nightsCount <= 10) {
                price = 2 * 24.99 + 3 * 14.99;
            } else if (nightsCount >= 11 && nightsCount <= 15) {
                price = 2 * 22.99 + 3 * 11.99;
            } else if (nightsCount > 15) {
                price = 2 * 20.00 + 3 * 10.00;
            }
        }
        if (destination.equals("canary islands")) {
            if (nightsCount >= 1 && nightsCount <= 10) {
                price = 2 * 32.50 + 3 * 28.50;
            } else if (nightsCount >= 11 && nightsCount <= 15) {
                price = 2 * 30.50 + 3 * 25.60;
            } else if (nightsCount > 15) {
                price = 2 * 28.00 + 3 * 22.00;
            }
        }
        if (destination.equals("philippines")) {
            if (nightsCount >= 1 && nightsCount <= 10) {
                price = 2 * 42.99 + 3 * 39.99;
            } else if (nightsCount >= 11 && nightsCount <= 15) {
                price = 2 * 41.00 + 3 * 36.00;
            } else if (nightsCount > 15) {
                price = 2 * 38.50 + 3 * 32.40;
            }
        }

        double totalForAllNights = (nightsCount * price) * (1 + 0.25);

        if (transport.equals("train")) {
            total = (2 * 22.30 + 3 * 12.50) + totalForAllNights;
        } else if (transport.equals("bus")) {
            total = (2 * 45.00 + 3 * 37.00) + totalForAllNights;
        } else if (transport.equals("airplane")) {
            total = (2 * 90.00 + 3 * 68.50) + totalForAllNights;
        }
        System.out.printf("%.3f", total);


    }
}
