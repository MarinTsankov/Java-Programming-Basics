import java.util.Scanner;

public class E_051117_P01_WireNet {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double lengthOfPlace = Double.parseDouble(console.nextLine());
        double widthOfPlace = Double.parseDouble(console.nextLine());
        double heightOfNet = Double.parseDouble(console.nextLine());
        double priceOfNet = Double.parseDouble(console.nextLine());
        double weightOfNet = Double.parseDouble(console.nextLine());

        double lengthOfNet = 2 * lengthOfPlace + 2 * widthOfPlace;
        double totalAreaOfNet = lengthOfNet * heightOfNet;
        double totalPrice = lengthOfNet * priceOfNet;
        double totalWeight = totalAreaOfNet * weightOfNet;


        System.out.printf("%d%n", (int) lengthOfNet);
        System.out.printf("%.2f%n", totalPrice);
        System.out.printf("%.3f", totalWeight);

    }
}
