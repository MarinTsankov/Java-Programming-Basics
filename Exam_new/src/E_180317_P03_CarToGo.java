import java.util.Scanner;

public class E_180317_P03_CarToGo {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        double budget = Double.parseDouble(console.nextLine());
        String season = console.nextLine().toLowerCase();
        String klass = "";
        double price = 0;
        String car = "";


        if (budget < 10 || budget > 10000) {
            System.out.println("Invalid number");
        }
        if (budget <= 100) {
            klass = "Economy class";
            switch (season) {
                case ("summer"):
                    price = budget * 35 / 100;
                    car = "Cabrio";
                    break;
                case ("winter"):
                    price = budget * 65 / 100;
                    car = "Jeep";
                    break;
            }
        }
        if (budget > 100 && budget <= 500) {
            klass = "Compact class";
            switch (season) {
                case ("summer"):
                    price = budget * 45 / 100;
                    car = "Cabrio";
                    break;
                case ("winter"):
                    price = budget * 80 / 100;
                    car = "Jeep";
                    break;
            }
        }
        if (budget > 500) {
            klass = "Luxury class";
            price = budget * 90 / 100;
            car = "Jeep";
        }
        System.out.printf("%s%n%s - %.2f", klass, car, price);
    }
}

