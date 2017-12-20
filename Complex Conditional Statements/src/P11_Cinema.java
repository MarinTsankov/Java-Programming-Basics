import java.util.Scanner;

public class P11_Cinema {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        String screenings = console.nextLine().toLowerCase();
        int rows = Integer.parseInt(console.nextLine());
        int colons = Integer.parseInt(console.nextLine());
        double price = -1;

        switch (screenings) {
            case ("premiere"):
                price = 12.00;
                break;
            case ("normal"):
                price = 7.50;
                break;
            case ("discount"):
                price = 5.00;
                break;
        }
        System.out.printf("%.2f leva", rows * colons * price );


    }
}
