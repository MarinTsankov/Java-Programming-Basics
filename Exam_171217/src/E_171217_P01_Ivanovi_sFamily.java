import java.util.Scanner;

public class E_171217_P01_Ivanovi_sFamily {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double budget = Double.parseDouble(console.nextLine());
        double priceForPresentFirstChild = Double.parseDouble(console.nextLine());
        double priceForPresentSecondChild = Double.parseDouble(console.nextLine());
        double priceForPresentThirdChild = Double.parseDouble(console.nextLine());


        double totalPrice = priceForPresentFirstChild + priceForPresentSecondChild + priceForPresentThirdChild;
        double totalWithTaxes = (budget - totalPrice) * (1 - 0.10);
        System.out.printf("%.2f", totalWithTaxes);


    }
}
