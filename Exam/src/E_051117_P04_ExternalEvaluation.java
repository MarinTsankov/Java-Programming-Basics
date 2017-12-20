import java.util.Scanner;

public class E_051117_P04_ExternalEvaluation {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        int n = Integer.parseInt(console.nextLine());
        double poorMark = 0;
        double satisfactoryMark = 0;
        double goodMark = 0;
        double veryGoodMark = 0;
        double excellentMark = 0;


        for (int i = 0; i < n; i++) {
            double points = Double.parseDouble(console.nextLine());
            if (points >= 0 && points < 22.5) {
                poorMark++;
            } else if (points >= 22.5 && points < 40.5) {
                satisfactoryMark++;
            } else if (points >= 40.5 && points < 58.5) {
                goodMark++;
            } else if (points >= 58.5 && points < 76.5) {
                veryGoodMark++;
            } else if (points >= 76.5 && points <= 100) {
                excellentMark++;
            }

        }
        System.out.printf("%.2f%% poor marks%n", (poorMark / n) * 100);
        System.out.printf("%.2f%% satisfactory marks%n", (satisfactoryMark / n) * 100);
        System.out.printf("%.2f%% good marks%n", (goodMark / n) * 100);
        System.out.printf("%.2f%% very good marks%n", (veryGoodMark / n) * 100);
        System.out.printf("%.2f%% excellent marks", (excellentMark / n) * 100);

    }
}
