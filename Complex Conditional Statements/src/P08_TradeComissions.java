import java.util.Scanner;

public class P08_TradeComissions {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String town = input.nextLine().toLowerCase();
        double sales = Double.parseDouble(input.nextLine());
        double commission = -1;

        if (town.equals("sofia")) {
            if (sales < 0) {
                System.out.println("error");
                return;
            } else if (sales >= 0 && sales <= 500) {
                commission = 5;
            } else if (sales <= 1000) {
                commission = 7;
            } else if (sales <= 10000) {
                commission = 8;
            } else if (sales > 10000) {
                commission = 12;
            }


        } else if (town.equals("varna")) {
            if (sales < 0) {
                System.out.println("error");
                return;
            } else if (sales >= 0 && sales <= 500) {
                commission = 4.5;
            } else if (sales <= 1000) {
                commission = 7.5;
            } else if (sales <= 10000) {
                commission = 10;
            } else if (sales > 10000) {
                commission = 13;
            }
            //return;

        } else if (town.equals("plovdiv")) {
            if (sales < 0) {
                System.out.println("error");
                return;
            } else if (sales >= 0 && sales <= 500) {
                commission = 5.5;
            } else if (sales <= 1000) {
                commission = 8;
            } else if (sales <= 10000) {
                commission = 12;
            } else if (sales > 10000) {
                commission = 14.5;
            }


        } else {
            System.out.println("error");
            return;
        }

        System.out.printf("%.2f", (commission / 100) * sales);
    }
}
