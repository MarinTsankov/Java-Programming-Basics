import java.util.Scanner;

public class E_030917_P04_Cake_new {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int widthOfCake = Integer.parseInt(console.nextLine());
        int lengthOfCake = Integer.parseInt(console.nextLine());
        String input = console.nextLine();
        int pieceOfCake = widthOfCake * lengthOfCake;
        boolean isCakeEnough = true;

        while (!input.equals("STOP")) {
            int piecesTaken = Integer.parseInt(input);
            pieceOfCake -= piecesTaken;
            if (pieceOfCake < 0) {
                isCakeEnough = false;
                break;
            }
            input = console.nextLine();
        }
        if (isCakeEnough) {
            System.out.printf("%d pieces are left.", pieceOfCake);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pieceOfCake));
        }
    }
}
