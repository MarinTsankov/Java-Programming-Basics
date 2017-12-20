import java.util.Scanner;

public class E_250617_P03_FruitCocktails {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String fruit = console.nextLine().toLowerCase();
        String size = console.nextLine().toLowerCase();
        double numOfDrinks = Double.parseDouble(console.nextLine());
        double price = 0;
        double discount = 0;

        switch (size) {
            case ("small"):
                switch (fruit) {
                    case ("watermelon"):
                        price = 2 * numOfDrinks * 56;
                        break;
                    case ("mango"):
                        price = 2 * numOfDrinks * 36.66;
                        break;
                    case ("pineapple"):
                        price = 2 * numOfDrinks * 42.10;
                        break;
                    case ("raspberry"):
                        price = 2 * numOfDrinks * 20;
                }
                break;
            case ("big"):
                switch (fruit) {
                    case ("watermelon"):
                        price = 5 * numOfDrinks * 28.70;
                        break;
                    case ("mango"):
                        price = 5 * numOfDrinks * 19.60;
                        break;
                    case ("pineapple"):
                        price = 5 * numOfDrinks * 24.80;
                        break;
                    case ("raspberry"):
                        price = 5 * numOfDrinks * 15.20;
                }
                break;
        }
        if (price >= 400 && price <= 1000) {
            discount = 0.15 * price;

        } else if (price > 1000) {
            discount = 0.5 * price;
        } else {
            discount = 0;
        }
        System.out.printf("%.2f lv.", price - discount);


    }
}
