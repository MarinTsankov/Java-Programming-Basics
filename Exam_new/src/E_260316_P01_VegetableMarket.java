import java.util.Scanner;

public class E_260316_P01_VegetableMarket {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double pricePerKiloVegetables = Double.parseDouble(console.nextLine());
        double pricePerKiloFruits = Double.parseDouble(console.nextLine());
        int totalKilosVegetables = Integer.parseInt(console.nextLine());
        int totalKilosFruits = Integer.parseInt(console.nextLine());

        double euro = 1.94;

        double vegetables = totalKilosVegetables * pricePerKiloVegetables;
        double fruits = totalKilosFruits * pricePerKiloFruits;

        double moneyFromVegetablesAndFruits = (vegetables + fruits) / euro;

        System.out.printf("% .13f", moneyFromVegetablesAndFruits);


    }
}
