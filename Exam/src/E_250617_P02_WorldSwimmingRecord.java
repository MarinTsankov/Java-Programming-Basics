import java.util.Scanner;

public class E_250617_P02_WorldSwimmingRecord {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double recInSec = Double.parseDouble(console.nextLine());
        double distance = Double.parseDouble(console.nextLine());
        double timeInSec = Double.parseDouble(console.nextLine());

        double currentDistance = distance * timeInSec;
        double totalDistance = Math.floor(distance / 15) * 12.5 + currentDistance;
        double diff = Math.abs(recInSec - totalDistance);

        if (recInSec > totalDistance) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalDistance);
        }else{
            System.out.printf("No, he failed! He was %.2f seconds slower.",diff);
        }
    }


}

