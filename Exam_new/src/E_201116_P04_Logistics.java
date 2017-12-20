import java.util.Scanner;

public class E_201116_P04_Logistics {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int numberOfLoads = Integer.parseInt(console.nextLine());
        double price = 0;
        double count1 = 0;
        double count2 = 0;
        double count3 = 0;
        double allTonnage = 0;


        for (int i = 0; i < numberOfLoads; i++) {
                int tonnageOfTheLoad = Integer.parseInt(console.nextLine());

            allTonnage += tonnageOfTheLoad;

            if (tonnageOfTheLoad <= 3) {
                price += tonnageOfTheLoad * 200;
                count1 += tonnageOfTheLoad;
            }
            if (tonnageOfTheLoad >= 4 && tonnageOfTheLoad <= 11) {
                price += tonnageOfTheLoad * 175;
                count2 += tonnageOfTheLoad;
            }
            if (tonnageOfTheLoad >= 12) {
                price += tonnageOfTheLoad * 120;
                count3 += tonnageOfTheLoad;
            }
        }
        double averagePricePerTonne = price / allTonnage;
        System.out.printf("%.2f%n", averagePricePerTonne);
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%", count1 / allTonnage * 100, count2 / allTonnage * 100, count3 / allTonnage * 100);

    }
}
