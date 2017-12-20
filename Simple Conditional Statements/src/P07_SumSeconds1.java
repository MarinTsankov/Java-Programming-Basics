import java.util.Scanner;

public class P07_SumSeconds1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int totalSeconds = a + b + c;
        int mins = totalSeconds/60;
        int seconds = totalSeconds%60;



        if (seconds < 10) {

            System.out.println(mins + ":0" + seconds);
        } else {

            System.out.println(mins + ":" + seconds);
        }
    }
}
