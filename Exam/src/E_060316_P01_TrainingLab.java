import java.util.Scanner;

public class E_060316_P01_TrainingLab {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double width = Double.parseDouble(console.nextLine());
        double height = Double.parseDouble(console.nextLine());

        double officesOnLine = Math.round((height * 100) - 100) / 70;
        System.out.println(officesOnLine);
        double lines = Math.round(width * 100) / 120;
        System.out.println(lines);
        double totalOffices = (officesOnLine * lines) - 3;
        System.out.println(totalOffices);

        System.out.printf("%.0f", totalOffices);
    }
}
