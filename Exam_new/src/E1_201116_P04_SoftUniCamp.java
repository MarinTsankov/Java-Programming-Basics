import java.util.Scanner;

public class E1_201116_P04_SoftUniCamp {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int num = Integer.parseInt(console.nextLine());
        double carCount = 0;
        double minibusCount = 0;
        double smallbusCount = 0;
        double busCount = 0;
        double trainCount = 0;
        double totalStudents = 0;

        for (int i = 0; i < num; i++) {
            int peoplesCount = Integer.parseInt(console.nextLine());

            totalStudents += peoplesCount;

            if (peoplesCount <= 5) {
                carCount += peoplesCount;
            }
            if (peoplesCount >= 6 && peoplesCount <= 12) {
                minibusCount += peoplesCount;
            }
            if (peoplesCount >= 13 && peoplesCount <= 25) {
                smallbusCount += peoplesCount;
            }
            if (peoplesCount >= 26 && peoplesCount <= 40) {
                busCount += peoplesCount;
            }
            if (peoplesCount >= 41) {
                trainCount += peoplesCount;
            }


        }
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%",
                carCount / totalStudents * 100, minibusCount / totalStudents * 100, smallbusCount / totalStudents * 100,
                busCount / totalStudents * 100, trainCount / totalStudents * 100);


    }
}
