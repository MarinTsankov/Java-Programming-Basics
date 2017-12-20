import java.util.Scanner;

public class E_070517_P04_FootballLeague {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double stadiumCapacity = Double.parseDouble(console.nextLine());
        double fansCount = Double.parseDouble(console.nextLine());
        double tempFansSectorACount = 0;
        double tempFansSectorBCount = 0;
        double tempFansSectorVCount = 0;
        double tempFansSectorGCount = 0;

        for (int i = 0; i < fansCount; i++) {
            String sector = console.nextLine();
            if (sector.equals("A")) {
                tempFansSectorACount++;
            } else if (sector.equals("B")) {
                tempFansSectorBCount++;
            } else if (sector.equals("V")) {
                tempFansSectorVCount++;
            } else {
                tempFansSectorGCount++;
            }
        }
        double percentFansInSectorA = (tempFansSectorACount / fansCount) * 100;
        double percentFansInSectorB = (tempFansSectorBCount / fansCount) * 100;
        double percentFansInSectorV = (tempFansSectorVCount / fansCount) * 100;
        double percentFansInSectorG = (tempFansSectorGCount / fansCount) * 100;
        double percentOfTotalFans = (fansCount / stadiumCapacity) * 100;


        System.out.printf("%.2f%%%n" +
                "%.2f%%%n" +
                "%.2f%%%n" +
                "%.2f%%%n" +
                "%.2f%%", percentFansInSectorA, percentFansInSectorB, percentFansInSectorV, percentFansInSectorG, percentOfTotalFans);

    }
}
