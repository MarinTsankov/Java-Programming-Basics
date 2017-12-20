import java.util.Scanner;

public class P08_MetricConverter {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double num = Double.parseDouble(console.nextLine());
        String first = console.nextLine();
        String second = console.nextLine();




        if (first.equals("mm")) {

            num = num / 1000;

        } else if (first.equals("cm")) {

            num = num / 100;
        } else if (first.equals("mi")) {

            num = num / 0.000621371192;

        } else if (first.equals("in")) {

            num = num / 39.3700787;
        } else if (first.equals("km")) {

            num = num / 0.001;
        } else if (first.equals("ft")) {

            num = num / 3.2808399;
        } else if (first.equals("yd")) {

            num = num / 1.0936133;
        }


        if (second.equals("mm")) {

            num = num * 1000;
        } else if (second.equals("cm")) {

            num = num * 100;
        } else if (second.equals("mi")) {

            num = num * 0.000621371192;
        } else if (second.equals("in")) {

            num = num * 39.3700787;
        } else if (second.equals("km")) {

            num = num * 0.001;
        } else if (second.equals("ft")) {

            num = num * 3.2808399;
        } else if (second.equals("yd")) {

            num = num * 1.0936133;
        }


        System.out.printf("%.8f %s,", num, second);
    }
}
