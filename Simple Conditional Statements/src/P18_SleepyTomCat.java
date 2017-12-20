import java.util.Scanner;

public class P18_SleepyTomCat {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int holidays = Integer.parseInt(console.nextLine());
        int workingDays = 365 - holidays;
        int realTime = workingDays * 63 + holidays * 127;
        int minLeft = 30000 - realTime;
        int hours = 0;
        int mins = 0;

        if (realTime <= 30000) {
            hours = minLeft / 60;
            mins = minLeft % 60;

            System.out.printf("Tom sleeps well\n%d hours and %d minutes less for play", hours, mins);

        } else {
            hours = Math.abs(minLeft / 60);
            mins = Math.abs(minLeft % 60);

            System.out.printf("Tom will run away\n%d hours and %d minutes more for play", hours, mins);


        }


    }
}

