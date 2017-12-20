import java.util.Scanner;

public class E_161217_P02_DeerOfSanta {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        int daysSantaAbsent = Integer.parseInt(console.nextLine());
        int foodLeft = Integer.parseInt(console.nextLine());
        double foodPerDayFirstDeer = Double.parseDouble(console.nextLine());
        double foodPerDaySecondDeer = Double.parseDouble(console.nextLine());
        double foodPerDayThirdDeer = Double.parseDouble(console.nextLine());


        double neededFoodFirstDeer = daysSantaAbsent * foodPerDayFirstDeer;
        double neededFoodSecondDeer = daysSantaAbsent * foodPerDaySecondDeer;
        double neededFoodThirdDeer = daysSantaAbsent * foodPerDayThirdDeer;

        double totalFoodNeeded = neededFoodFirstDeer + neededFoodSecondDeer + neededFoodThirdDeer;

        if (foodLeft > totalFoodNeeded) {
            System.out.printf("%.0f kilos of food left.", Math.floor(Math.abs(foodLeft - totalFoodNeeded)));
        } else {
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil(Math.abs(totalFoodNeeded - foodLeft)));
        }


    }
}
