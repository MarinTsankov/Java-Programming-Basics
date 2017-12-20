import java.util.Scanner;

public class E_070517_P03_SchoolCamp {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        String season = console.nextLine().toLowerCase();
        String typeOfGroup = console.nextLine().toLowerCase();
        int studentsCount = Integer.parseInt(console.nextLine());
        int nightsCount = Integer.parseInt(console.nextLine());
        double price = 0;
        String typeOfSport = "";
        double discount = 0;

        if (season.equals("winter")) {
            if (typeOfGroup.equals("boys")) {
                price = 9.60;
                typeOfSport = "Judo";
            } else if (typeOfGroup.equals("girls")) {
                price = 9.60;
                typeOfSport = "Gymnastics";
            } else {
                price = 10;
                typeOfSport = "Ski";
            }
        }
        if (season.equals("spring")) {
            if (typeOfGroup.equals("boys")) {
                price = 7.20;
                typeOfSport = "Tennis";
            } else if (typeOfGroup.equals("girls")) {
                price = 7.20;
                typeOfSport = "Athletics";
            } else {
                price = 9.50;
                typeOfSport = "Cycling";
            }
        }
        if (season.equals("summer")) {
            if (typeOfGroup.equals("boys")) {
                price = 15;
                typeOfSport = "Football";
            } else if (typeOfGroup.equals("girls")) {
                price = 15;
                typeOfSport = "Volleyball";
            } else {
                price = 20;
                typeOfSport = "Swimming";
            }
        }
        if (studentsCount >= 10 && studentsCount < 20) {
            discount = 0.05;
        } else if (studentsCount >= 20 && studentsCount < 50) {
            discount = 0.15;
        } else if (studentsCount >= 50) {
            discount = 0.50;
        }
        double totalPrice = (studentsCount * price * nightsCount) * (1 - discount);
        System.out.printf("%s %.2f lv.", typeOfSport, totalPrice);
    }
}
