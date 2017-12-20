import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class P14_TimePlus15Minutes {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int mins = Integer.parseInt(scanner.nextLine());
        mins = mins + 15;


        if (mins >= 60) {
            hours = hours + 1;
            mins = mins - 60;
        }
        if (hours >= 24) {
            hours = hours - 24;
        }
        if (mins < 10) {
            System.out.println(hours + ":0" + mins);

        } else {
            System.out.println(hours + ":" + mins);

        }
    }
}
