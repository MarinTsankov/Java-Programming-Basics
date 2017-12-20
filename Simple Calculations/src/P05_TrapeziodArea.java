import java.util.Scanner;

public class P05_TrapeziodArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.print("h: ");
        double h = Double.parseDouble(scanner.nextLine());

        double S = ((a + b) * h) / 2.0;

        System.out.print("S: ");
        System.out.println(S);


    }
}
