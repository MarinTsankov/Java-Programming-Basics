import java.util.Scanner;

public class E_190317_P01_GrapeAndRakia {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double grapeArea = Double.parseDouble(console.nextLine());
        double kilosGrapePerSquareMeter = Double.parseDouble(console.nextLine());
        double waste = Double.parseDouble(console.nextLine());

        double totalGrape = (grapeArea * kilosGrapePerSquareMeter) - waste;
        double forRakia = totalGrape * 0.45;
        double forSale = totalGrape * 0.55;

        double totalRakia = forRakia / 7.5;
        double amountFromRania = totalRakia * 9.80;
        double amountFromSale = forSale * 1.50;

        System.out.printf("%.2f%n",amountFromRania);
        System.out.printf("%.2f",amountFromSale);
    }
}
