import java.util.Scanner;

public class E1_190317_P01_HousePainting {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double x = Double.parseDouble(console.nextLine());
        double y = Double.parseDouble(console.nextLine());
        double h = Double.parseDouble(console.nextLine());

        double door = 1.2 * 2;
        double windows = 1.5 * 1.5;

        //Walls
        double frontSide = (x * x) - door;
        double rearSide = x * x;
        double leftRightSide = 2 * ((x * y) - windows);

        //Roof
        double rectangles = 2 * (x * y);
        double triangles = 2 * ((x * h) / 2);

        double totalAreaGreenColored = frontSide + rearSide + leftRightSide;
        double totalAreaRedColored = rectangles + triangles;

        double totalRedColor = totalAreaRedColored / 4.3;
        double totalGreenColor = totalAreaGreenColored / 3.4;

        System.out.printf("%.2f%n%.2f", totalGreenColor, totalRedColor);
    }
}

