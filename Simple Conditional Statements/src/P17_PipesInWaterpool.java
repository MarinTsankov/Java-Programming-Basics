import java.util.Scanner;

public class P17_PipesInWaterpool {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int V = Integer.parseInt(scanner.nextLine());
        int pipe1 = Integer.parseInt(scanner.nextLine());
        int pipe2 = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());
        double totalPipe1 = pipe1 * hours;
        double totalPipe2 = pipe2 * hours;
        double total = totalPipe1 + totalPipe2;
        int totalPercent = (int) Math.floor(total / V * 100);
        int totalPipe1Percent = (int) Math.floor(totalPipe1 / total * 100);
        int totalPipe2Percent = (int) Math.floor(totalPipe2 / total * 100);
        double totalOverFlow = total - V;


        if (total <= V) {
            System.out.printf("The pool is %d%% full. Pipe 1: %d%%. Pipe 2: %d%%.", totalPercent, totalPipe1Percent, totalPipe2Percent);
        } else if ((hours * 10) % 10 == 0) {
            System.out.printf("For %.0f hours the pool overflows with %.1f liters.", hours, totalOverFlow);

        } else if ((hours * 100) % 10 == 0) {
            System.out.printf("For %.1f hours the pool overflows with %.1f liters.", hours, totalOverFlow);

        } else {
            System.out.printf("For %.2f hours the pool overflows with %.1f liters.", hours, totalOverFlow);
        }


    }
}
