import java.util.Scanner;

public class P19_Harvest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        int SqM = Integer.parseInt(console.nextLine());
        double grapePerSqM = Double.parseDouble(console.nextLine());
        int neededLiters = Integer.parseInt(console.nextLine());
        int workers = Integer.parseInt(console.nextLine());
        double totalGrape = SqM * grapePerSqM;
        double Wine = 0.40 * totalGrape / 2.5;
        double wineLeft = Math.ceil(Wine - neededLiters);
        double literPerPerson = Math.ceil(wineLeft / workers);


        if (Wine >= neededLiters) {
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n" +
                    "%.0f liters left -> %.0f liters per person.", Math.floor(Wine), wineLeft, literPerPerson);
        } else {
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(neededLiters - Wine));


        }


    }
}
