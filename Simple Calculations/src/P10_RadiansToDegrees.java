import java.util.Scanner;

public class P10_RadiansToDegrees {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double radians = Double.parseDouble(scanner.nextLine());
        double degrees = Math.round((radians * 180) / Math.PI);
        //double degrees = (radians * 180) / Math.PI;

        System.out.println(degrees);
    }
}
