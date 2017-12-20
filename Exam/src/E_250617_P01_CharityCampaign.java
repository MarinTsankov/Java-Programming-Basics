import java.util.Scanner;

public class E_250617_P01_CharityCampaign {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int days = Integer.parseInt(console.nextLine());
        int numOfConfectioners = Integer.parseInt(console.nextLine());
        int numOfCakes = Integer.parseInt(console.nextLine());
        int numOfWaffles = Integer.parseInt(console.nextLine());
        int numOfPancakes = Integer.parseInt(console.nextLine());

        double amountForCakes = numOfCakes * 45;
        double amountForWaffles = numOfWaffles * 5.8;
        double amountOfPancakes = numOfPancakes * 3.2;
        double totalPerDay = (amountForCakes + amountForWaffles + amountOfPancakes) * numOfConfectioners;
        double totalForAllDays = totalPerDay * days;
        double total = totalForAllDays - (totalForAllDays / 8);
        System.out.printf("%.2f", total);
    }
}
