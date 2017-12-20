import java.util.Scanner;

public class E_201116_P01_HousePrice {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double smallerRoomArea = Double.parseDouble(console.nextLine());
        double kitchenRoomArea = Double.parseDouble(console.nextLine());
        double pricePerSquareMeter = Double.parseDouble(console.nextLine());

        double bathroomArea = smallerRoomArea / 2;
        double secondRoom = smallerRoomArea * (1 + 0.10);
        double thirdRoom = secondRoom * (1 + 0.10);
        double totalArea = (smallerRoomArea + bathroomArea + secondRoom + thirdRoom + kitchenRoomArea) * (1 + 0.05);
        double price = totalArea * pricePerSquareMeter;
        System.out.printf("%.2f", price);


    }
}
