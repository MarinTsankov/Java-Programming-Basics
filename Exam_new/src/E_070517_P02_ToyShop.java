import java.util.Scanner;

public class E_070517_P02_ToyShop {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double excursionPrice = Double.parseDouble(console.nextLine());
        double puzzlesCount = Double.parseDouble(console.nextLine());
        double talkingDollsCount = Double.parseDouble(console.nextLine());
        double teddyBearsCount = Double.parseDouble(console.nextLine());
        double minionsCount = Double.parseDouble(console.nextLine());
        double trucksCount = Double.parseDouble(console.nextLine());

        double count = puzzlesCount + talkingDollsCount + teddyBearsCount + minionsCount + trucksCount;
        double price = puzzlesCount * 2.60 + talkingDollsCount * 3 + teddyBearsCount * 4.10 + minionsCount * 8.20 + trucksCount * 2;
        double discount = 0;

        if (count >= 50) {
            discount = price * 0.25;
        }
        price -= discount;
        double rents = price * 0.1;
        double total = price - rents;

        if (total >= excursionPrice) {
            System.out.printf("Yes! %.2f lv left.", Math.abs(excursionPrice - total));

        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(excursionPrice - total));
        }
    }
}
