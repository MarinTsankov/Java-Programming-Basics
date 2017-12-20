import java.util.Scanner;

public class E1_190317_P02_Cups {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int cups = Integer.parseInt(console.nextLine());
        int workersCount = Integer.parseInt(console.nextLine());
        int workingDays = Integer.parseInt(console.nextLine());

        int totalHours = workingDays * workersCount * 8;
        double cupsPerHours = totalHours / 5;
        double amountFromCups = cupsPerHours * 4.20;
        double diff = Math.abs(amountFromCups - (cups * 4.20));

        if (cupsPerHours >= cups) {
            System.out.printf("%.2f extra money", diff);
        } else {
            System.out.printf("Losses: %.2f", diff);
        }

    }
}
