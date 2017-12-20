import java.util.Scanner;

public class E_180317_P02_WorkHours {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        int neededHours = Integer.parseInt(console.nextLine());
        int workersCount = Integer.parseInt(console.nextLine());
        int workingDays = Integer.parseInt(console.nextLine());

        int totalHours = workersCount * workingDays * 8;
        int extraHours = Math.abs(totalHours - neededHours);
        int penalties = extraHours * workingDays;

        if (totalHours >= neededHours) {
            System.out.printf("%d hours left", Math.abs(totalHours - neededHours));
        } else {
            System.out.printf("%d overtime%nPenalties: %d", extraHours, penalties);
        }

    }
}
