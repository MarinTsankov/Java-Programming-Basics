import java.util.Scanner;

public class E_030917_P01_TailoringWorkshop {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int numberOfTables = Integer.parseInt(console.nextLine());
        double length = Double.parseDouble(console.nextLine());
        double width = Double.parseDouble(console.nextLine());

        double recCovArea = (length + (2 * 0.30)) * (width + (2 * 0.30));
        double carriage = (length / 2) * (length / 2);

        double totalPrice = ((numberOfTables * recCovArea) * 7) + ((numberOfTables * carriage) * 9);

        System.out.printf("%.2f USD\n" +
                "%.2f BGN", totalPrice, totalPrice * 1.85);


    }
}
