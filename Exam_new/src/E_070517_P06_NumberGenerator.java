import java.util.Scanner;

public class E_070517_P06_NumberGenerator {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int M = Integer.parseInt(console.nextLine());
        int N = Integer.parseInt(console.nextLine());
        int L = Integer.parseInt(console.nextLine());
        int specialNumber = Integer.parseInt(console.nextLine());
        int controlNumber = Integer.parseInt(console.nextLine());

        for (int i = M; i >= 1; i--) {
            for (int j = N; j >= 1; j--) {
                for (int k = L; k >= 1; k--) {
                    int MNL = i * 100 + j * 10 + k;

                    if (MNL % 3 == 0) {
                        specialNumber += 5;
                    } else if (MNL % 10 == 5) {
                        specialNumber -= 2;
                    } else if (MNL % 2 == 0) {
                        specialNumber *= 2;
                    }
                    if (specialNumber >= controlNumber) {
                        System.out.printf("Yes! Control number was reached! Current special number is %d.", specialNumber);
                        return;
                    }
                }
            }
        }
        if (specialNumber < controlNumber)
            System.out.printf("No! %d is the last reached special number.", specialNumber);

    }
}




