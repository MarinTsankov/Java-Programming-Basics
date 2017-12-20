import java.util.Scanner;

public class E_181216_P06_LettersCombinations {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        char litleLeterBegining = console.nextLine().charAt(0);
        char litleLeterEnd = console.nextLine().charAt(0);
        char litleLeter = console.nextLine().charAt(0);
        int count = 0;


        for (char i = litleLeterBegining; i <= litleLeterEnd; i++) {
            for (char j = litleLeterBegining; j <= litleLeterEnd; j++) {
                for (char k = litleLeterBegining; k <= litleLeterEnd; k++) {
                    if (i != litleLeter && j != litleLeter && k != litleLeter) {
                        count++;
                        System.out.print("" + i + j + k + " ");
                    }

                }

            }
        }

        System.out.println(count);
    }
}
