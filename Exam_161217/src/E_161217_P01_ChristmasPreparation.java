import java.util.Scanner;

public class E_161217_P01_ChristmasPreparation {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        int rollsWrappingPaperCount = Integer.parseInt(console.nextLine());
        int rollsClothCount = Integer.parseInt(console.nextLine());
        double litersGlue = Double.parseDouble(console.nextLine());
        double percentDiscount = Double.parseDouble(console.nextLine());


        double wrappingPaper = 5.80;
        double cloth = 7.20;
        double glue = 1.20;

        double priceRowsWrappingPaper = rollsWrappingPaperCount * wrappingPaper;
        double priceRollsCloth = rollsClothCount * cloth;
        double priceGlue = litersGlue * glue;

        double totalPrice = priceRowsWrappingPaper + priceRollsCloth + priceGlue;
        double totalPriceWithDiscount = totalPrice - ((totalPrice * percentDiscount) / 100);


        System.out.printf("%.3f", totalPriceWithDiscount);

    }
}
