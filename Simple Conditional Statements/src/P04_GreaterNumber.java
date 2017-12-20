import java.util.Scanner;

public class P04_GreaterNumber {


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int a = Integer.parseInt(console.nextLine());
        int b = Integer.parseInt(console.nextLine());

        if (a > b) {

            System.out.printf("Greater number:%d", a);
        } else {

            System.out.printf("Greater number:%d", b);
        }


    }
}
