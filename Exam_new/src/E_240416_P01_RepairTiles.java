import java.util.Scanner;

public class E_240416_P01_RepairTiles {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        int lengthOfSideOfSite = Integer.parseInt(console.nextLine());
        double widthOfTile = Double.parseDouble(console.nextLine());
        double lengthOfTile = Double.parseDouble(console.nextLine());
        double widthOfBench = Double.parseDouble(console.nextLine());
        double lengthOfBench = Double.parseDouble(console.nextLine());


        double siteArea = lengthOfSideOfSite * lengthOfSideOfSite;
        double benchArea = widthOfBench * lengthOfBench;
        double totalSiteArea = siteArea - benchArea;
        double tilesArea = widthOfTile * lengthOfTile;
        double totalTiles = totalSiteArea / tilesArea;
        double timeNeeded = totalTiles * 0.2;

        System.out.printf("%.2f%n%.2f", totalTiles, timeNeeded);


    }
}
