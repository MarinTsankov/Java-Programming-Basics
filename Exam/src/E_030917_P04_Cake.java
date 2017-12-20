import java.util.Scanner;

public class E_030917_P04_Cake {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int widthOfCake = Integer.parseInt(console.nextLine());
        int lengthOfCake = Integer.parseInt(console.nextLine());
        int pieceOfCake = widthOfCake * lengthOfCake;
        String input;

        for (int i = pieceOfCake; i > -1; i = pieceOfCake) {
            input = console.nextLine();
            if (input.equals("STOP")) {
                System.out.printf("%d pieces are left.", pieceOfCake);
                break;
            } else {
                int piecesTaken = Integer.parseInt(input);
                pieceOfCake = pieceOfCake - piecesTaken;
                if (pieceOfCake < 0) {
                    System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pieceOfCake));
                    break;
                }

            }


        }
    }
}
