import java.util.Scanner;

public class E_070517_P01_AlcoholMarket {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double whiskyPrice = Double.parseDouble(console.nextLine());
        double quantityOfBeer = Double.parseDouble(console.nextLine());
        double quantityOfWine = Double.parseDouble(console.nextLine());
        double quantityOfGrape = Double.parseDouble(console.nextLine());
        double quantityOfWhisky = Double.parseDouble(console.nextLine());
        double grapePrice = (whiskyPrice / 2);
        double winePrice = (grapePrice * (1 - 0.4));
        double beerPrice = (grapePrice * (1 - 0.8));

        double totalPrice = whiskyPrice * quantityOfWhisky + grapePrice * quantityOfGrape + winePrice * quantityOfWine + beerPrice * quantityOfBeer;

        System.out.printf("%.2f", totalPrice);
    }
}
