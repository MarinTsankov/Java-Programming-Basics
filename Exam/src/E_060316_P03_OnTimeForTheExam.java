import java.util.Scanner;

public class E_060316_P03_OnTimeForTheExam {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int hourOfExam = Integer.parseInt(console.nextLine());
        int minOfExam = Integer.parseInt(console.nextLine());
        int hourOfArrival = Integer.parseInt(console.nextLine());
        int minOfArrival = Integer.parseInt(console.nextLine());

        int totalMinOfExam = (hourOfExam * 60) + minOfExam;
        int totalMinOfArrival = (hourOfArrival * 60) + minOfArrival;
        int totalMin = totalMinOfExam - totalMinOfArrival;
        int hour = Math.abs(totalMin / 60);
        int min = Math.abs(totalMin % 60);


        if (totalMin == 0) {
            System.out.println("On time");
        } else if (totalMin > 0 && totalMin <= 30) {
            System.out.printf("On time\n" +
                    "%d minutes before the start\n", totalMin);
        } else if (totalMin > 30 && totalMin < 60) {
            System.out.printf("Early\n" +
                    "%d minutes before the start\n", totalMin);
        } else if (totalMin >= 60) {
            System.out.printf("Early\n" +
                    "%d:%02d hours before the start\n", hour, min);
        } else if (totalMin > -60) {
            System.out.printf("Late\n" +
                    "%d minutes after the start\n", Math.abs(totalMin));
        } else if (totalMin <= -60) {
            System.out.printf("Late\n" +
                    "%d:%02d hours after the start\n", hour, min);
        }


    }
}
