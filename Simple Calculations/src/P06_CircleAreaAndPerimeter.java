import java.util.Scanner;

public class P06_CircleAreaAndPerimeter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());
        double Area = Math.PI * r * r;

        System.out.println(Area);

        double Perimeter = 2 * Math.PI * r;

        System.out.println(Perimeter);

    }
}
