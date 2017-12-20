import java.util.Scanner;

public class E_171217_P04_Workout {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int days = Integer.parseInt(console.nextLine());

        double total = 0;
        double temp = 0;

        for (int i = 1; i <= days + 1; i++) {

            if (i == 1) {
                double kilometers = Double.parseDouble(console.nextLine());
                total = kilometers;
                temp = total;
            } else {
                double percent = Double.parseDouble(console.nextLine());
                temp = temp * (1 + percent / 100);
                total += temp;

            }
        }
        if (total >= 1000) {
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(total - 1000));
        } else {
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(1000 - total));
        }


    }
}
