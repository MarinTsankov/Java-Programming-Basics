import java.util.Scanner;

public class E_170716_P04_BackToThePast {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        double inheritedMoney = Double.parseDouble(console.nextLine());
        int yearToLeave = Integer.parseInt(console.nextLine());
        int age = 18;

        for (int i = 1800; i <= yearToLeave; i++) {
            if (i % 2 == 0) {
                inheritedMoney -= 12000;
            } else {
                inheritedMoney -= (12000 + (50 * age));
            }
            age++;
        }
        if (inheritedMoney >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", inheritedMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(inheritedMoney));
        }
    }
}
