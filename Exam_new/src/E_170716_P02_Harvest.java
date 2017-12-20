import java.util.Scanner;

public class E_170716_P02_Harvest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double areaOfGrape = Double.parseDouble(console.nextLine());
        double grapePerSquareMeter = Double.parseDouble(console.nextLine());
        double neededWine = Double.parseDouble(console.nextLine());
        double workersCount = Double.parseDouble(console.nextLine());


        double wineArea = areaOfGrape * grapePerSquareMeter;
        double wine = wineArea / 2.5 * 0.40;
        double wineDiff = Math.abs(wine - neededWine);
        double winePerWorkers = wineDiff / workersCount;

        if (wine < neededWine) {
            System.out.printf("It will be a tough winter! More %d liters wine needed.", (int) Math.floor(wineDiff));
        } else {
            System.out.printf("Good harvest this year! Total wine: %d liters.%n" +
                            "%d liters left -> %d liters per person.", (int) Math.floor(wine), (int) Math.ceil(wineDiff),
                    (int) Math.ceil(winePerWorkers));
        }


    }
}
