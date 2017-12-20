import java.util.Scanner;

public class E1_201116_P06_Battles {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        int pokemonCountFirstPlayer = Integer.parseInt(console.nextLine());
        int pokemonCountSecondPlayer = Integer.parseInt(console.nextLine());
        int maxCountBattles = Integer.parseInt(console.nextLine());
        int count = 0;



        for (int i = 1; i <= pokemonCountFirstPlayer; i++) {
            for (int j = 1; j <= pokemonCountSecondPlayer; j++) {
                count++;
                if (count <= maxCountBattles) {
                    System.out.print("" + "(" + i + " <-> " + j + ") ");
                } else {
                    break;
                }
            }
        }
    }
}
