import java.util.Scanner;

public class E_030917_P02_Scholarship {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double income = Double.parseDouble(console.nextLine());
        double averageSuccess = Double.parseDouble(console.nextLine());
        double minSalary = Double.parseDouble(console.nextLine());
        double socialScholarship = -1;
        double greatSuccess = -1;

        boolean socialSalary = income < minSalary && averageSuccess > 4.5;
        boolean successSalary = averageSuccess >= 5.5;


        if (!socialSalary && !successSalary) {
            System.out.println("You cannot get a scholarship!");
        } else {
            if (socialSalary) {
                socialScholarship = minSalary * 0.35;
            }
            if (successSalary) {
                greatSuccess = averageSuccess * 25;
            }
            if (socialScholarship > greatSuccess) {
                System.out.printf("You get a Social scholarship %.0f BGN ", Math.floor(socialScholarship));
            } else {
                System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(greatSuccess));
            }
        }
    }
}