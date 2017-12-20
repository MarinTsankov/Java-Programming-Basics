import java.util.Scanner;

public class P07_FruitShop {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String fruit = console.nextLine().toLowerCase();
        String day = console.nextLine().toLowerCase();
        double quantity = Double.parseDouble(console.nextLine());
        double price = -1;

        boolean workingDays = (day.equals("monday")) || (day.equals("tuesday")) ||
                (day.equals("wednesday")) || (day.equals("thursday")) || (day.equals("friday"));
        boolean weekend = (day.contains("saturday")) || (day.equals("sunday"));


        if (workingDays) {
            if (fruit.equals("banana")) {
                price = 2.50;
            } else if (fruit.equals("apple")) {
                price = 1.20;
            } else if (fruit.equals("orange")) {
                price = 0.85;
            } else if (fruit.equals("grapefruit")) {
                price = 1.45;
            } else if (fruit.equals("kiwi")) {
                price = 2.70;
            } else if (fruit.equals("pineapple")) {
                price = 5.50;
            } else if (fruit.equals("grapes")) {
                price = 3.85;
            } else {
                System.out.println("error");
                return;
            }
        } else if (weekend) {
            if (fruit.equals("banana")) {
                price = 2.70;
            } else if (fruit.equals("apple")) {
                price = 1.25;
            } else if (fruit.equals("orange")) {
                price = 0.90;
            } else if (fruit.equals("grapefruit")) {
                price = 1.60;
            } else if (fruit.equals("kiwi")) {
                price = 3.00;
            } else if (fruit.equals("pineapple")) {
                price = 5.60;
            } else if (fruit.equals("grapes")) {
                price = 4.20;
            } else {
                System.out.println("error");
                return;
            }

        } else {
            System.out.println("error");
            return;
        }
        System.out.println(price * quantity);
    }
}