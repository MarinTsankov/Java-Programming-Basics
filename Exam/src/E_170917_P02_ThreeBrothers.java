import java.util.Scanner;

public class E_170917_P02_ThreeBrothers {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double firstBrother = Double.parseDouble(console.nextLine());
        double secondBrother = Double.parseDouble(console.nextLine());
        double thirdBrother = Double.parseDouble(console.nextLine());
        double father = Double.parseDouble(console.nextLine());

        double totalTime = 1 / (1 / firstBrother + 1 / secondBrother + 1 / thirdBrother);
        double cleaningTime = totalTime * (1 + 0.15);
        double allTime = father - cleaningTime;

        System.out.printf("Cleaning time: %.2f", cleaningTime);
        System.out.println("");

        if (allTime > 0) {
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours.", Math.floor(allTime));

        } else {
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.", Math.ceil(Math.abs(allTime)));
        }


    }
}
