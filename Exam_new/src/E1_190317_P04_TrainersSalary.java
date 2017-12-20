import java.util.Scanner;

public class E1_190317_P04_TrainersSalary {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int lecturesCount = Integer.parseInt(console.nextLine());
        double budget = Double.parseDouble(console.nextLine());
        double budgetPetLector = budget / lecturesCount;


        double jelevSalary = 0;
        double roYaLSalary = 0;
        double roliSalary = 0;
        double trofonSalary = 0;
        double sinoSalary = 0;
        double othersSalary = 0;

        for (int i = 0; i < lecturesCount; i++) {
            String nameOfLector = console.nextLine().toLowerCase();
            if (!nameOfLector.equals("jelev") && !nameOfLector.equals("royal") && !nameOfLector.equals("roli") && !nameOfLector.equals("trofon")
                    && !nameOfLector.equals("sino")) {
                othersSalary++;
            } else {
                switch (nameOfLector) {
                    case ("jelev"):
                        jelevSalary++;
                        break;
                    case ("royal"):
                        roYaLSalary++;
                        break;
                    case ("roli"):
                        roliSalary++;
                        break;
                    case ("trofon"):
                        trofonSalary++;
                        break;
                    case ("sino"):
                        sinoSalary++;
                        break;
                }
            }
        }

        System.out.printf("Jelev salary: %.2f lv%nRoYaL salary: %.2f lv%n" +
                        "Roli salary: %.2f lv%nTrofon salary: %.2f lv%nSino salary: %.2f lv%n" +
                        "Others salary: %.2f lv",
                jelevSalary * budgetPetLector, roYaLSalary * budgetPetLector, roliSalary * budgetPetLector
                , trofonSalary * budgetPetLector, sinoSalary * budgetPetLector, othersSalary * budgetPetLector);

    }
}
