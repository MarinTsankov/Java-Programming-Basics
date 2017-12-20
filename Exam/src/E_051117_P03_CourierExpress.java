import java.util.Scanner;

public class E_051117_P03_CourierExpress {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double weight = Double.parseDouble(console.nextLine());
        String type = console.nextLine().toLowerCase();
        double kilometers = Double.parseDouble(console.nextLine());
        double price = 0;
        double overcharge = 0;
        double charge = 0;

        if (type.equals("standard")) {
            if (weight < 1) {
                price = 0.03 * kilometers;
            } else if (weight >= 1 && weight <= 10) {
                price = 0.05 * kilometers;
            } else if (weight >= 11 && weight <= 40) {
                price = 0.10 * kilometers;
            } else if (weight >= 41 && weight <= 90) {
                price = 0.15 * kilometers;
            } else {
                price = 0.20 * kilometers;
            }
        } else {
            if (weight < 1) {
                overcharge = 0.8;
                charge = (overcharge * 0.03) * weight;
                price = (0.03 * kilometers) + (kilometers * charge);
            } else if (weight >= 1 && weight <= 10) {
                overcharge = 0.4;
                charge = (overcharge * 0.05) * weight;
                price = (0.05 * kilometers) + (kilometers * charge);
            } else if (weight >= 11 && weight <= 40) {
                overcharge = 0.05;
                charge = (overcharge * 0.10) * weight;
                price = (0.10 * kilometers) + (kilometers * charge);
            } else if (weight >= 41 && weight <= 90) {
                overcharge = 0.02;
                charge = (overcharge * 0.15) * weight;
                price = (0.15 * kilometers) + (kilometers * charge);
            } else {
                overcharge = 0.01;
                charge = (overcharge * 0.20) * weight;
                price = (0.20 * kilometers) + (kilometers * charge);
            }
        }
        System.out.printf("The delivery of your shipment with weight of %.3f kg. would cost %.2f lv.", weight, price);


    }
}
