import java.util.Scanner;

public class P01_SquareArea {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.print("SquareArea: ");
        int SquareArea = a * a;
        System.out.println(SquareArea);


    }
}
