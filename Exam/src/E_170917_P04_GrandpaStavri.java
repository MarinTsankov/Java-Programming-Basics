import java.util.Scanner;

public class E_170917_P04_GrandpaStavri {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        int days = Integer.parseInt(console.nextLine());
        double totalLiters = 0;
        double averageDegrees = 0;


        for (int i = 0; i < days; i++) {
            double liters = Double.parseDouble(console.nextLine());
            double degrees = Double.parseDouble(console.nextLine());

            totalLiters = totalLiters + liters;
            averageDegrees = averageDegrees + (liters * degrees);

            if (i == days - 1) {
                averageDegrees = averageDegrees / totalLiters;
            }
        }
        System.out.printf("Liter: %.2f\n" +
                "Degrees: %.2f\n" +
                "",totalLiters,averageDegrees);


        if (averageDegrees < 38) {
            System.out.println("Not good, you should baking!");
        } else if (averageDegrees <= 42) {
            System.out.println("Super!");
        } else {
            System.out.println("Dilution with distilled water!");
        }
    }
}
