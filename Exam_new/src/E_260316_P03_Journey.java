import java.util.Scanner;

public class E_260316_P03_Journey {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        double budget = Double.parseDouble(console.nextLine());
        String season = console.nextLine().toLowerCase();

        String accommodation = "";
        String destination = "";

        switch (season) {
            case ("summer"):
                if (budget <= 100) {
                    destination = "Bulgaria";
                    budget *= 0.30;
                    break;
                }
                if (budget <= 1000) {
                    destination = "Balkans";
                    budget *= 0.40;
                    break;
                }

            case ("winter"):
                if (budget <= 100) {
                    destination = "Bulgaria";
                    budget *= 0.70;
                    break;
                }
                if (budget <= 1000) {
                    destination = "Balkans";
                    budget *= 0.80;
                    break;
                }
        }
        if (budget > 1000) {
            destination = "Europe";
            budget *= 0.90;
        }
        if (season.equals("winter") || destination.equals("Europe")) {
            accommodation = "Hotel";
        } else {
            accommodation = "Camp";
        }
        System.out.printf("Somewhere in %s%n" +
                "%s - %.2f", destination, accommodation, budget);

    }


}

