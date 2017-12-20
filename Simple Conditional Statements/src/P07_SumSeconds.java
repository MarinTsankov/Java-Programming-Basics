import java.util.Scanner;

public class P07_SumSeconds {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int totalSeconds = a + b + c;
        int mins = 0;

        if (totalSeconds > 59) {

            mins = mins + 1;
            totalSeconds = totalSeconds - 60;
        }
        if (totalSeconds > 59) {

            mins = mins + 1;
            totalSeconds = totalSeconds - 60;
        }
        if (totalSeconds < 10) {

            System.out.println(mins + ":0" + totalSeconds);
        } else {

            System.out.println(mins + ":" + totalSeconds);
        }
    }
}
