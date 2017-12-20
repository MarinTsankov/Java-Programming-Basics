import java.util.Scanner;

public class E1_201116_P01_Fishland {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double mackerelPrice = Double.parseDouble(console.nextLine());
        double spratPrice = Double.parseDouble(console.nextLine());
        double palamudKilos = Double.parseDouble(console.nextLine());
        double safridKilos = Double.parseDouble(console.nextLine());
        double musselsKilos = Double.parseDouble(console.nextLine());

        double palamudPrice = mackerelPrice * (1 + 0.60);
        double safridPrice = spratPrice * (1 + 0.80);
        double musselsPrice = 7.50;

        double totalPlalamud = palamudKilos * palamudPrice;
        double totalSafrid = safridKilos * safridPrice;
        double totalMussels = musselsKilos * musselsPrice;

        double amount = totalMussels + totalPlalamud + totalSafrid;

        System.out.printf("%.2f", amount);

    }
}
