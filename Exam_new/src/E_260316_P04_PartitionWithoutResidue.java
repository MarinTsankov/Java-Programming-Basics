import java.util.Scanner;

public class E_260316_P04_PartitionWithoutResidue {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        double p1Count = 0;
        double p2Count = 0;
        double p3Count = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(console.nextLine());
            if (num % 2 == 0) {
                p1Count++;
            }
            if (num % 3 == 0) {
                p2Count++;
            }
            if (num % 4 == 0) {
                p3Count++;
            }
        }
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%", p1Count / n * 100, p2Count / n * 100, p3Count / n * 100);


    }
}
