import java.util.Scanner;

public class E_201116_P03_BikeRace {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int numJuniorCyclists = Integer.parseInt(console.nextLine());
        int numSeniorCyclists = Integer.parseInt(console.nextLine());
        String road = console.nextLine().toLowerCase();
        double taxJunior = 0;
        double taxSenior = 0;
        int count = 0;

        switch (road) {
            case ("trail"):
                taxJunior = numJuniorCyclists * 5.50;
                break;
            case ("cross-country"):
                taxJunior = numJuniorCyclists * 8.00;
                count += numJuniorCyclists;
                break;
            case ("downhill"):
                taxJunior = numJuniorCyclists * 12.25;
                break;
            case ("road"):
                taxJunior = numJuniorCyclists * 20.00;
                break;
        }
        switch (road) {
            case ("trail"):
                taxSenior = numSeniorCyclists * 7.00;
                break;
            case ("cross-country"):
                taxSenior = numSeniorCyclists * 9.50;
                count += numSeniorCyclists;
                break;
            case ("downhill"):
                taxSenior = numSeniorCyclists * 13.75;
                break;
            case ("road"):
                taxSenior = numSeniorCyclists * 21.50;
                break;
        }
        double allTaxes = taxJunior + taxSenior;
        if (count >= 50) {
            allTaxes *= (1 - 0.25);
        }

        double totalAmount = allTaxes * (1 - 0.05);


        System.out.printf("%.2f", totalAmount);


    }
}
