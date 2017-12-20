import java.util.Scanner;

public class E1_190317_P03_Vacation {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double budget = Double.parseDouble(console.nextLine());
        String season = console.nextLine().toLowerCase();
        String accommodation = "";
        String location = "";
        double price = 0;

        if (budget <= 1000) {
            accommodation = "Camp";
            if (season.equals("summer")) {
                location = "Alaska";
                price = budget * 0.65;
            }
            if (season.equals("winter")) {
                location = "Morocco";
                price = budget * 0.45;
            }
        }
        if (budget > 1000 && budget <= 3000) {
            accommodation = "Hut";
            if (season.equals("summer")) {
                location = "Alaska";
                price = budget * 0.80;
            }
            if (season.equals("winter")) {
                location = "Morocco";
                price = budget * 0.60;
            }
        }
        if (budget > 3000) {
            accommodation = "Hotel";
            if (season.equals("summer")) {
                location = "Alaska";
                price = budget * 0.90;
            }
            if (season.equals("winter")) {
                location = "Morocco";
                price = budget * 0.90;
            }
        }
        System.out.printf("%s - %s - %.2f", location, accommodation, price);

    }
}
