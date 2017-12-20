import java.util.Scanner;

public class E_190317_P03_TruckDriver {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String season = console.nextLine().toLowerCase();
        double kilometersPerMonth = Double.parseDouble(console.nextLine());
        double price = 0;

        if (kilometersPerMonth > 10000 && kilometersPerMonth <= 20000) {
            price = 1.45;
        }
        if (season.equals("summer")) {
            if (kilometersPerMonth <= 5000) {
                price = 0.90;
            } else if (kilometersPerMonth <= 10000) {
                price = 1.10;
            }
        }
        if (season.equals("winter")) {
            if (kilometersPerMonth <= 5000) {
                price = 1.05;
            } else if (kilometersPerMonth <= 10000) {
                price = 1.25;
            }
        }
        if ((season.equals("spring")) || (season.equals("autumn"))) {
            if (kilometersPerMonth <= 5000) {
                price = 0.75;
            } else if (kilometersPerMonth <= 10000) {
                price = 0.95;
            }
        }
        double salary = kilometersPerMonth * price * 4;
        double total = salary * (1 - 0.10);
        System.out.printf("%.2f", total);
    }
}
