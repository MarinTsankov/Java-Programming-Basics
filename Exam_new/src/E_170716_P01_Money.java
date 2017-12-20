import java.util.Scanner;

public class E_170716_P01_Money {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        double bitcoinCount = Double.parseDouble(console.nextLine());
        double yuanCount = Double.parseDouble(console.nextLine());
        double commission = Double.parseDouble(console.nextLine());


        double bitcoinToEuro = (bitcoinCount * 1168) / 1.95;
        double yuanToEuro = (yuanCount * (0.15 * 1.76)) / 1.95;
        double totalEuro = (bitcoinToEuro + yuanToEuro) * (1 - (commission / 100));

        System.out.printf("%.2f", totalEuro);
    }
}
