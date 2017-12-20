import java.util.Scanner;

public class E_230717_P02_Choreography {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double steps = Double.parseDouble(console.nextLine());
        double dancers = Double.parseDouble(console.nextLine());
        double days = Double.parseDouble(console.nextLine());

        double percentStepsPerDancer = Math.ceil((steps / days) / steps * 100);
        double totalPercent = (percentStepsPerDancer / dancers);

        if (percentStepsPerDancer <= 13) {
            System.out.printf("Yes, they will succeed in that goal! %.2f%%.", totalPercent);
        } else {
            System.out.printf("No, They will not succeed in that goal! Required %.2f%% steps to be learned per day.", totalPercent);
        }

    }
}
