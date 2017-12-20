import java.util.Scanner;

public class E_030917_P03_PhotoPictures {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int numberOfPic = Integer.parseInt(console.nextLine());
        String kindOfPic = console.nextLine();
        String ordering = console.nextLine();
        double price = 0;
        double discount = 0;


        if (ordering.equals("office")) {
            if (kindOfPic.equals("9X13")) {
                price = 0.16;
                if (numberOfPic >= 50) {
                    discount = 0.05;
                }
            } else if (kindOfPic.equals("10X15")) {
                price = 0.16;
                if (numberOfPic >= 80) {
                    discount = 0.03;
                }
            } else if (kindOfPic.equals("13X18")) {
                price = 0.38;
                if (numberOfPic >= 50 && numberOfPic <= 100) {
                    discount = 0.03;
                } else {
                    discount = 0.05;
                }
            } else {
                price = 2.90;
                if (numberOfPic >= 10 && numberOfPic <= 50) {
                    discount = 0.07;
                } else {
                    discount = 0.09;
                }
            }System.out.printf("%.2fBGN", (numberOfPic * price) - (numberOfPic * price * discount));
            return;
        }

        if (ordering.equals("online")) {

            if (kindOfPic.equals("9X13")) {
                price = 0.16;
                if (numberOfPic >= 50) {
                    discount = 0.05;
                }
            } else if (kindOfPic.equals("10X15")) {
                price = 0.16;
                if (numberOfPic >= 80) {
                    discount = 0.03;
                }
            } else if (kindOfPic.equals("13X18")) {
                price = 0.38;
                if (numberOfPic >= 50 && numberOfPic <= 100) {
                    discount = 0.03;
                } else {
                    discount = 0.05;
                }
            } else {
                price = 2.90;
                if (numberOfPic >= 10 && numberOfPic <= 50) {
                    discount = 0.07;
                } else {
                    discount = 0.09;

                }

            }

            System.out.printf("%.2fBGN", ((numberOfPic * price) - (numberOfPic * price * discount)) - 0.02 * ((numberOfPic * price) - (numberOfPic * price * discount)));
        }


    }
}