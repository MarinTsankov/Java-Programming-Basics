import java.util.Scanner;

public class E1_201116_P03_Vacation {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        int adultCount = Integer.parseInt(console.nextLine());
        int studentsCount = Integer.parseInt(console.nextLine());
        int nightsCount = Integer.parseInt(console.nextLine());
        String transport = console.nextLine().toLowerCase();
        double price = 0.0;
        double pricePerNightForTheWholeGroup = 82.99;


        double totalPassengers = studentsCount + adultCount;

        //Students
        switch (transport) {
            case ("train"):
                price += 14.99 * studentsCount;
                break;
            case ("bus"):
                price += 28.50 * studentsCount;
                break;
            case ("boat"):
                price += 39.99 * studentsCount;
                break;
            case ("airplane"):
                price += 50.00 * studentsCount;
                break;
        }
        //Adults
        switch (transport) {
            case ("train"):
                price += 24.99 * adultCount;
                break;
            case ("bus"):
                price += 32.50 * adultCount;
                break;
            case ("boat"):
                price += 42.99 * adultCount;
                break;
            case ("airplane"):
                price += 70.00 * adultCount;
                break;
        }
        price *= 2;
        if (totalPassengers >= 50 && transport.equals("train")) {
            price *= (1 - 0.50);
        }
        double priceForAllNights = nightsCount * pricePerNightForTheWholeGroup;
        double commission = (price + priceForAllNights) * 0.10;
        double amount = price + commission + priceForAllNights;

        System.out.printf("%.2f", amount);


    }
}
