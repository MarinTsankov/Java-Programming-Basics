import java.text.DecimalFormat;
        import java.util.Scanner;

public class E_260316_P02_PipesInPool {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.#######");


        int areaOfPool = Integer.parseInt(console.nextLine());
        int firstPipeFlowPerHour = Integer.parseInt(console.nextLine());
        int secondPipeFlowPerHour = Integer.parseInt(console.nextLine());
        double hoursWorkerAbsent = Double.parseDouble(console.nextLine());


        double firstPipe = hoursWorkerAbsent * firstPipeFlowPerHour;
        double secondPipe = hoursWorkerAbsent * secondPipeFlowPerHour;
        double total = firstPipe + secondPipe;

        if (total <= areaOfPool) {
            System.out.printf("The pool is %.0f%% full. Pipe 1: %.0f%%. Pipe 2: %.0f%%.", Math.floor(total / areaOfPool * 100),
                    Math.floor(firstPipe / total * 100),
                    Math.floor(secondPipe / total * 100));
        } else {
            System.out.printf("For %s hours the pool overflows with %.1f liters.", df.format(hoursWorkerAbsent), total - areaOfPool);
        }


    }
}
