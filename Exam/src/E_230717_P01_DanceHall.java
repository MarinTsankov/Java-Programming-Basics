import java.util.Scanner;

public class E_230717_P01_DanceHall {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double lengthOfHall = Double.parseDouble(console.nextLine());
        double widthOfHall = Double.parseDouble(console.nextLine());
        double sideOfWardrobe = Double.parseDouble(console.nextLine());

        double area = (lengthOfHall * 100) * (widthOfHall * 100);
        double wardrobe = Math.pow((sideOfWardrobe * 100), 2);
        double benchSize = area / 10;
        double freeSpace = area - wardrobe - benchSize;
        double dancers = Math.floor(freeSpace / (40 + 7000));

        System.out.println((int)dancers);


    }
}
