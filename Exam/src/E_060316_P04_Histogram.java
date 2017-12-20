import java.util.Scanner;

public class E_060316_P04_Histogram {

    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        double currentP1 = 0;
        double currentP2 = 0;
        double currentP3 = 0;
        double currentP4 = 0;
        double currentP5 = 0;


        for (int i = 0; i < n; i++) {
            int p = Integer.parseInt(console.nextLine());
            if (p < 200) {
                currentP1++;
            } else if (p <= 399) {
                currentP2++;
            } else if (p <= 599) {
                currentP3++;
            } else if (p <= 799) {
                currentP4++;
            } else if (p >= 800) {
                currentP5++;
            }


        }
        System.out.printf("%.2f%n",currentP1 / n * 100);
        System.out.printf("%.2f%n",currentP2 / n * 100);
        System.out.printf("%.2f%n",currentP3 / n * 100);
        System.out.printf("%.2f%n",currentP4 / n * 100);
        System.out.printf("%.2f",currentP5 / n * 100);
    }
}
