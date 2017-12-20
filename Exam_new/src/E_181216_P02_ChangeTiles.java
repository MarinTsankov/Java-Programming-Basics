import java.util.Scanner;

public class E_181216_P02_ChangeTiles {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        double totalCash = Double.parseDouble(console.nextLine());
        double widthOfFloor = Double.parseDouble(console.nextLine());
        double lengthOfFloor = Double.parseDouble(console.nextLine());
        double triangleSide = Double.parseDouble(console.nextLine());
        double triangleHeight = Double.parseDouble(console.nextLine());
        double pricePerTiles = Double.parseDouble(console.nextLine());
        double amountForTheMaster = Double.parseDouble(console.nextLine());


        double floorArea = widthOfFloor * lengthOfFloor;
        double triangleTiles = triangleSide * triangleHeight / 2;
        double neededTiles = Math.ceil(floorArea / triangleTiles) + 5;
        double totalAmount = neededTiles * pricePerTiles + amountForTheMaster;

        if (totalAmount <= totalCash) {
            System.out.printf("%.2f lv left.", Math.abs(totalAmount - totalCash));
        } else {
            System.out.printf("You'll need %.2f lv more.", Math.abs(totalAmount - totalCash));
        }

    }
}
