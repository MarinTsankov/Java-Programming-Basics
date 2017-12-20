import java.util.Scanner;

public class P13_PointInTheFigure {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int h = Integer.parseInt(console.nextLine());
        int x = Integer.parseInt(console.nextLine());
        int y = Integer.parseInt(console.nextLine());

        boolean outOfRectangle1 = (x < 0 || x > 3 * h) || (y < 0 || y > h);
        boolean outOfRectangle2 = (x < h || x > 2 * h) || (y < h || y > 4 * h);

        boolean inRectangle1 = (x > 0 && x < 3 * h) && (y > 0 && y < h);
        boolean inRectangle2 = (x > h && x < 2 * h) && (y > h && y < 4 * h);

        boolean border = (x > h && x < 2 * h) && y == h;

        if (outOfRectangle1 && outOfRectangle2) {
            System.out.println("outside");
        } else if (inRectangle1 || inRectangle2 || border) {
            System.out.println("inside");
        } else {
            System.out.println("border");
        }


    }
}
