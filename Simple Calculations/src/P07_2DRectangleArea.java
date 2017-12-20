import java.util.Scanner;

public class P07_2DRectangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());


        //double base = Math.max(x1, x2) - Math.min(x1, x2);
        //double height = Math.max(y1, y2) - Math.min(y1, y2);


        double base = Math.abs(x1- x2);
        double height = Math.abs(y2- y1);

        double area = base * height;
        double perimeter = 2 * base + 2 * height;


        System.out.println(area);
        System.out.println(perimeter);
    }

}
