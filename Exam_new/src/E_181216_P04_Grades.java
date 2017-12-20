import java.util.Scanner;

public class E_181216_P04_Grades {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int studentsCount = Integer.parseInt(console.nextLine());

        double topStudentsCount = 0;
        double between4And4_99 = 0;
        double between3And3_99 = 0;
        double fail = 0;
        double average = 0;

        for (int i = 0; i < studentsCount; i++) {
            double grade = Double.parseDouble(console.nextLine());

            average += grade;

            if (grade >= 5) {
                topStudentsCount++;
            }
            if (grade >= 4 && grade < 5) {
                between4And4_99++;
            }
            if (grade >= 3 && grade < 4) {
                between3And3_99++;
            }
            if (grade < 3) {
                fail++;
            }
        }
        average /= studentsCount;
        System.out.printf("Top students: %.2f%%%n" +
                        "Between 4.00 and 4.99: %.2f%%%n" +
                        "Between 3.00 and 3.99: %.2f%%%n" +
                        "Fail: %.2f%%%n" +
                        "Average: %.2f", topStudentsCount / studentsCount * 100, between4And4_99 / studentsCount * 100
                , between3And3_99 / studentsCount * 100, fail / studentsCount * 100,average);
    }
}
