import java.util.Scanner;

public class E1_201116_P02_Pets {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double daysCount = Double.parseDouble(console.nextLine());
        double foodLeft = Double.parseDouble(console.nextLine());
        double foodPerDayForDog = Double.parseDouble(console.nextLine());
        double foodPerDayForCat = Double.parseDouble(console.nextLine());
        double foodPerDayForTurtle = Double.parseDouble(console.nextLine());


        double neededFoodForDog = daysCount * foodPerDayForDog;
        double neededFoodForCat = daysCount * foodPerDayForCat;
        double neededFoodForTurtle = daysCount * foodPerDayForTurtle / 1000;

        double totalFood = neededFoodForCat + neededFoodForDog + neededFoodForTurtle;

        if (totalFood <= foodLeft) {
            System.out.printf("%.0f kilos of food left.", Math.floor(Math.abs(totalFood - foodLeft)));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(Math.abs(totalFood - foodLeft)));


        }
    }
}