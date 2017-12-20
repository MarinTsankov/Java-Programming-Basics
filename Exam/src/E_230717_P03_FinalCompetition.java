import java.util.Scanner;

public class E_230717_P03_FinalCompetition {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double dancers = Double.parseDouble(console.nextLine());
        double points = Double.parseDouble(console.nextLine());
        String season = console.nextLine().toLowerCase();
        String place = console.nextLine().toLowerCase();
        double ammount = -1;
        double totalAmmount = -1;
        double charity = -1;
        double moneyPerDancer = -1;
        double restOfMoney = -1;


        switch (place) {
            case ("bulgaria"):
                ammount = dancers * points;
                switch (season) {
                    case ("summer"):
                        totalAmmount = ammount - 0.05 * ammount;
                        break;
                    case ("winter"):
                        totalAmmount = ammount - 0.08 * ammount;

                }
                break;
        }
        switch (place) {
            case ("abroad"):
                ammount = dancers * points + 0.5 * dancers * points;
                switch (season) {
                    case ("summer"):
                        totalAmmount = ammount - 0.1 * ammount;
                        break;
                    case ("winter"):
                        totalAmmount = ammount - 0.15 * ammount;
                }
                break;


        }
        charity = 0.75 * totalAmmount;
        restOfMoney = (totalAmmount - charity);
        moneyPerDancer = restOfMoney / dancers;

        System.out.printf("Charity - %.2f%n", charity);
        System.out.printf("Money per dancer - %.2f", moneyPerDancer);


    }
}
