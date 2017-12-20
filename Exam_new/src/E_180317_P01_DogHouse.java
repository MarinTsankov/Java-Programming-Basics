import java.util.Scanner;

public class E_180317_P01_DogHouse {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double lengthA = Double.parseDouble(console.nextLine());
        double heightB = Double.parseDouble(console.nextLine());

        double rectangleSide = lengthA * (lengthA / 2);
        double rearSide = (lengthA / 2 * lengthA / 2) + ((lengthA / 2 * (heightB - lengthA / 2)) / 2);
        double frontSide = rearSide - (lengthA / 5 * lengthA / 5);
        double roof = 2 * (lengthA * lengthA / 2);

        double totalGround = (2 * rectangleSide) + rearSide + frontSide;
        double totalGreenColor = totalGround / 3;
        double totalRedColor = roof / 5;


        System.out.printf("%.2f%n%.2f", totalGreenColor, totalRedColor);

    }
}
