import java.util.Scanner;

public class E_170716_P06_StopNumber {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        int N = Integer.parseInt(console.nextLine());
        int M = Integer.parseInt(console.nextLine());
        int S = Integer.parseInt(console.nextLine());

        for (int i = M; i >= N; i--) {
            if (i % 2 == 0 && i % 3 == 0) {
                if (i == S) {
                    return;
                }
                System.out.print(i + " ");

            }
        }
    }
}


