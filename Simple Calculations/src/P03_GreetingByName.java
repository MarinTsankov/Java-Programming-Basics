import java.util.Scanner;

public class P03_GreetingByName {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Hello, ");
        System.out.print(name);
        System.out.println("!");

    }

}
