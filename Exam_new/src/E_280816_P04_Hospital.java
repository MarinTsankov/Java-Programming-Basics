import java.util.Scanner;

public class E_280816_P04_Hospital {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);


        int period = Integer.parseInt(console.nextLine());
        int doctors = 7;
        int countTreated = 0;
        int countUntreated = 0;
        int treated = 0;
        int untreated = 0;

        for (int i = 1; i <= period; i++) {

            int patients = Integer.parseInt(console.nextLine());
            if (i % 3 == 0) {
                if (countUntreated > countTreated)
                    doctors++;
            }
            if (patients <= doctors) {
                countTreated += patients;
            } else {
                countTreated += doctors;
                countUntreated += Math.abs(patients - doctors);
            }


        }
        System.out.printf("Treated patients: %d.%nUntreated patients: %d."
                , countTreated, countUntreated);

    }
}


