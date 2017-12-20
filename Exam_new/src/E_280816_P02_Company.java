import java.util.Scanner;

public class E_280816_P02_Company {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int neededHours = Integer.parseInt(console.nextLine());
        int days = Integer.parseInt(console.nextLine());
        int workersCount = Integer.parseInt(console.nextLine());

        double training = days * (1 - 0.10);
        double totalDays = training * 8;
        double extraTime = workersCount * (days * 2);
        double totalHours = totalDays + extraTime;

        if (totalHours >= neededHours) {
            System.out.printf("Yes!%d hours left.", (int) (Math.abs(Math.floor(totalHours - neededHours))));
        } else {
            System.out.printf("Not enough time!%d hours needed.", (int) (Math.abs(Math.floor(totalHours - neededHours))));
        }

    }
}
