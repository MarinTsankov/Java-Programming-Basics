import java.util.Scanner;

public class E_190317_P02_Styrofoam {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double budget = Double.parseDouble(console.nextLine());
        double areaOfTheHouse = Double.parseDouble(console.nextLine());
        double windowsCount = Double.parseDouble(console.nextLine());
        double squareMeterStyrofoamInPacket = Double.parseDouble(console.nextLine());
        double pricePerPacketStyrofoam = Double.parseDouble(console.nextLine());

        double windowsArea = windowsCount * 2.4;
        double totalAreaWithoutWindows = (areaOfTheHouse - windowsArea) * (1 + 0.10);
        double packetNeeded = Math.ceil(totalAreaWithoutWindows / squareMeterStyrofoamInPacket);
        double amountForStyrofoam = packetNeeded * pricePerPacketStyrofoam;

        if (budget >= amountForStyrofoam) {
            System.out.printf("Spent: %.2f%n" +
                    "Left: %.2f", amountForStyrofoam, budget - amountForStyrofoam);
        } else {
            System.out.printf("Need more: %.2f", Math.abs(budget - amountForStyrofoam));
        }

    }
}
