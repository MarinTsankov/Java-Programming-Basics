import java.util.Scanner;

public class E_170917_P03_MobileOperator {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        String duration = console.nextLine().toLowerCase();
        String type = console.nextLine().toLowerCase();
        String internet = console.nextLine().toLowerCase();
        int months = Integer.parseInt(console.nextLine());
        double price = -1;
        double add = -1;

        if (duration.equals("one")) {
            if (type.equals("small")) {
                price = 9.98;
            } else if (type.equals("middle")) {
                price = 18.99;
            } else if (type.equals("large")) {
                price = 25.98;
            } else {
                price = 35.99;
            }
        } else {
            if (type.equals("small")) {
                price = 8.58;
            } else if (type.equals("middle")) {
                price = 17.09;
            } else if (type.equals("large")) {
                price = 23.59;
            } else {
                price = 31.79;
            }

        }
        if (internet.equals("yes")) {
            if (price <= 10.00) {
                price = price + 5.50;
            } else if (price <= 30.00) {
                price = price + 4.35;
            } else {
                price = price + 3.85;
            }
        }
        if (duration.equals("two")) {
            price = price * (1 - 0.0375);


        }
        System.out.printf("%.2f lv.", price * months);


    }
}
