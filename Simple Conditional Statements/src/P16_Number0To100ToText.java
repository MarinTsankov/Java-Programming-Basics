import java.util.Scanner;


public class P16_Number0To100ToText {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int num = Integer.parseInt(console.nextLine());
        int value1 = -1;
        int value2 = -1;

        if (num >= 0 && num <= 19) {

            if (num == 0) {
                System.out.println("zero");
            } else if (num == 1) {
                System.out.println("one");
            } else if (num == 2) {
                System.out.println("two");
            } else if (num == 3) {
                System.out.println("three");
            } else if (num == 4) {
                System.out.println("four");
            } else if (num == 5) {
                System.out.println("five");
            } else if (num == 6) {
                System.out.println("six");
            } else if (num == 7) {
                System.out.println("seven");
            } else if (num == 8) {
                System.out.println("eight");
            } else if (num == 9) {
                System.out.println("nine");
            } else if (num == 10) {
                System.out.println("ten");
            } else if (num == 11) {
                System.out.println("eleven");
            } else if (num == 12) {
                System.out.println("twelve");
            } else if (num == 13) {
                System.out.println("thirteen");
            } else if (num == 14) {
                System.out.println("fourteen");
            } else if (num == 15) {
                System.out.println("fifteen");
            } else if (num == 16) {
                System.out.println("sixteen");
            } else if (num == 17) {
                System.out.println("seventeen");
            } else if (num == 18) {
                System.out.println("eighteen");
            } else if (num == 19) {
                System.out.println("nineteen");

            }
            return;
        }
        if (num > 19 && num <= 99) {
            value1 = num / 10;
            value2 = num % 10;

            if (value1 == 2) {
                System.out.print("twenty");
            } else if (value1 == 3) {
                System.out.print("thirty");
            } else if (value1 == 4) {
                System.out.print("forty");
            } else if (value1 == 5) {
                System.out.print("fifty");
            } else if (value1 == 6) {
                System.out.print("sixty");
            } else if (value1 == 7) {
                System.out.print("seventy");
            } else if (value1 == 8) {
                System.out.print("eighty");
            } else if (value1 == 9) {
                System.out.print("ninety");
            }
            if (value2 == 1) {
                System.out.println(" one");
            } else if (value2 == 2) {
                System.out.println(" two");
            } else if (value2 == 3) {
                System.out.println(" three");
            } else if (value2 == 4) {
                System.out.println(" four");
            } else if (value2 == 5) {
                System.out.println(" five");
            } else if (value2 == 6) {
                System.out.println(" six");
            } else if (value2 == 7) {
                System.out.println(" seven");
            } else if (value2 == 8) {
                System.out.println(" eight");
            } else if (value2 == 9) {
                System.out.println(" nine");
            }
        } else if (num == 100) {
            System.out.println("one hundred");
        } else {
            System.out.println("invalid number");
        }

    }
}