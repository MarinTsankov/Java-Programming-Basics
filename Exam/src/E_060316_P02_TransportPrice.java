import java.util.Scanner;

public class E_060316_P02_TransportPrice {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        String periodOfDay = console.nextLine();
        double prise = 0;

        if (periodOfDay.equals("day")) {
            if (n < 20) {
                prise = n * 0.79 + 0.70;
            } else if (n < 100) {
                prise = n * 0.09;
            } else {
                prise = n * 0.06;
            }
        }

        if (periodOfDay.equals("night")) {

            if (n < 20) {
                prise = n * 0.90 + 0.70;
            } else if (n < 100) {
                prise = n * 0.09;
            } else {
                prise = n * 0.06;
            }
        }

        System.out.printf("%.2f", prise);

    }
}