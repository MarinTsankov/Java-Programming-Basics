import java.util.Scanner;

public class E_201116_P02_FlowerShop {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double magnoliaCount = Double.parseDouble(console.nextLine());
        double hyacinthsCount = Double.parseDouble(console.nextLine());
        double rosesCount = Double.parseDouble(console.nextLine());
        double cactiCount = Double.parseDouble(console.nextLine());
        double price = Double.parseDouble(console.nextLine());

        double totalMagnolia = magnoliaCount * 3.25;
        double totalHyacinths = hyacinthsCount * 4.00;
        double totalRoses = rosesCount * 3.50;
        double totalCacti = cactiCount * 8.00;

        double amount = (totalCacti + totalHyacinths + totalMagnolia + totalRoses) * (1 - 0.05);

        if (amount >= price) {
            System.out.printf("She is left with %.0f leva.", Math.floor(amount - price));
        } else {
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(Math.abs(amount - price)));
        }


    }

}
