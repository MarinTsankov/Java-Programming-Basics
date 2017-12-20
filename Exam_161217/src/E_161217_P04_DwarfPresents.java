import java.util.Scanner;

public class E_161217_P04_DwarfPresents {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        int n = Integer.parseInt(console.nextLine());
        double money = Double.parseDouble(console.nextLine());
        double price = 0;


        for (int i = 0; i < n; i++) {
            String present = console.nextLine().toLowerCase();
            if (present.equals("sand clock")) {
                double sandClockPrice = 2.20;
                price += sandClockPrice;

            } else if (present.equals("magnet")) {
                double magnetPrice = 1.50;
                price += magnetPrice;

            } else if (present.equals("cup")) {
                double cupPrice = 5.00;
                price += cupPrice;

            } else if (present.equals("t-shirt")) {
                double tshirtPrice = 10.00;
                price += tshirtPrice;

            }
        }
        if (money >= price) {
            System.out.printf("Santa Claus has %.2f more leva left!", money - price);
        } else {
            System.out.printf("Santa Claus will need %.2f more leva.", price - money);
        }


    }
}
