import java.util.Scanner;

public class P12_Volleyball {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        String year = console.nextLine();
        double holidays = Double.parseDouble(console.nextLine());
        double weekends = Double.parseDouble(console.nextLine());
        double weekendsInSofia = (48 - weekends) * 3 / 4;
        double gamesInSofiaPerHolydays = holidays * 2 / 3;
        double totalCames = weekends + weekendsInSofia + gamesInSofiaPerHolydays;


        switch (year) {
            case ("leap"):
                double add = (15 * totalCames) / 100;
                System.out.println((int)Math.floor(add + totalCames));
                break;
            case ("normal"):
                System.out.println((int) Math.floor(totalCames));
                break;


        }


    }
}
