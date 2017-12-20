import java.util.Scanner;

public class E_181216_P01_Distance {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double initialSpeed = Double.parseDouble(console.nextLine());
        double firstTime = Double.parseDouble(console.nextLine());
        double secondTime = Double.parseDouble(console.nextLine());
        double thirdTime = Double.parseDouble(console.nextLine());
        double firstDistance = 0;
        double secondDistance = 0;
        double thirdDistance = 0;
        double totalDistance = 0;

        firstDistance = initialSpeed * (firstTime / 60);
        secondDistance = (initialSpeed * (1 + 0.10)) * (secondTime / 60);
        thirdDistance = ((initialSpeed * (1 + 0.10)) * (1 - 0.05)) * (thirdTime / 60);
        totalDistance = firstDistance + secondDistance + thirdDistance;

        System.out.printf("%.2f",totalDistance);

    }
}
