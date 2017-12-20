import java.util.Scanner;

public class E_240416_P02_SleepingCatTom {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        int n = Integer.parseInt(console.nextLine());

        int workdays = 365 - n;
        int totalPlayDuringWorkdays = workdays * 63;
        int totalPlayDuringHolidays = n * 127;
        int totalPlay = totalPlayDuringHolidays + totalPlayDuringWorkdays;

        int diff = Math.abs(totalPlay - 30000);
        int hour = diff / 60;
        int minutes = diff % 60;

        if (totalPlay <= 30000) {
            System.out.printf("Tom sleeps well%n%d hours and %d minutes less for play", hour, minutes);
        } else {
            System.out.printf("Tom will run away%n%d hours and %d minutes more for play", hour, minutes);
        }


    }
}
