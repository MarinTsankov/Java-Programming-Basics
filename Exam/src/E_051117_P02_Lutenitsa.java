import java.util.Scanner;

public class E_051117_P02_Lutenitsa {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double quantityTomato = Double.parseDouble(console.nextLine());
        int numOfBoxes = Integer.parseInt(console.nextLine());
        int numOfJars = Integer.parseInt(console.nextLine());

        double totalLutenica = quantityTomato / 5;
        double totalJars = totalLutenica / 0.535;
        double totalBoxes = totalJars / numOfJars;
        double totalInTruck = numOfBoxes * numOfJars;
        System.out.printf("Total lutenica: %d kilograms.%n", (int) totalLutenica);

        if (numOfJars >= totalJars || numOfBoxes >= totalBoxes) {
            System.out.printf("%d more boxes needed.%n", (int) Math.floor(Math.abs(totalBoxes - numOfBoxes)));
            System.out.printf("%d more jars needed.", (int) Math.floor(Math.abs(totalJars - totalInTruck)));
        } else {
            System.out.printf("%d boxes left.%n", (int) Math.floor(Math.abs(totalBoxes - numOfBoxes)));
            System.out.printf("%d jars left.", (int) Math.floor(Math.abs(totalJars - totalInTruck)));
        }
    }
}
