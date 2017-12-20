import java.util.Scanner;

public class E_181216_P03_Flowers {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double chrysanthemumsCount = Double.parseDouble(console.nextLine());
        double rosesCount = Double.parseDouble(console.nextLine());
        double tulipsCount = Double.parseDouble(console.nextLine());
        String season = console.nextLine().toLowerCase();
        String holidays = console.nextLine().toLowerCase();
        double chrysanthemumsPrice = 0;
        double rosesPrice = 0;
        double tulipsPrice = 0;
        double discount = 0;
        double totalFlowers = chrysanthemumsCount + rosesCount + tulipsCount;


        if (season.equals("spring") || (season.equals("summer"))) {
            chrysanthemumsPrice = 2.00;
            rosesPrice = 4.10;
            tulipsPrice = 2.50;
        }


        if (season.equals("autumn") || (season.equals("winter"))) {
            chrysanthemumsPrice = 3.75;
            rosesPrice = 4.50;
            tulipsPrice = 4.15;

        }


        double totalPrice = chrysanthemumsPrice * chrysanthemumsCount + rosesCount * rosesPrice + tulipsCount * tulipsPrice;
        if (holidays.equals("y"))

        {
            totalPrice *= 1.15;
        }

        if (tulipsCount > 7 && season.equals("spring"))

        {
            totalPrice *= 0.95;
        }
        if (rosesCount >= 10 && season.equals("winter"))

        {
            totalPrice *= 0.90;
        }


        if (totalFlowers > 20)

        {
            discount = 0.20;
            totalPrice *= (1 - discount);
        }


        System.out.printf("%.2f", totalPrice + 2);
    }
}




