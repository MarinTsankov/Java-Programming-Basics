import java.util.Scanner;

public class P09_CelsiusToFahrenheit {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        double celsius = Double.parseDouble(scanner.nextLine());
        double fahrenheit = (1.8 * celsius) + 32;

        System.out.printf("%.2f", fahrenheit);

    }
}
