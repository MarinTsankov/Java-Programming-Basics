import java.util.Scanner;

public class E_230717_P04_EnergyLoss {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int trainingDays = Integer.parseInt(console.nextLine());
        int dancers = Integer.parseInt(console.nextLine());
        double training = -1;
        double training1 = 0;
        double training2 = 0;
        double training3 = 0;
        double training4 = 0;
        double energy = -1;
        double totalEnergyLost = -1;
        double energyLostPerDancer = -1;

        for (int i = 1; i < trainingDays+1 ; i++) {
            training = 0;
            double  hours = Double.parseDouble(console.nextLine());
            if (hours % 2 == 0 && i % 2 == 0) {
                training = dancers * 68;
                training1 = training + training1;

            } else if (i % 2 != 0 && hours % 2 == 0) {
                training = dancers * 49;
                training2 = training + training2;

            } else if (i % 2 == 0 && hours % 2 != 0) {
                training = dancers * 65;
                training3 = training + training3;

            } else if (hours != 0 && i != 0) {
                training = dancers * 30;
                training4 = training + training4;

            }
        }
        energy = 100 * trainingDays * dancers;
        totalEnergyLost = energy - (training1 + training2 + training3 + training4);
        energyLostPerDancer = totalEnergyLost / dancers / trainingDays;
        if (energyLostPerDancer >= 50) {
            System.out.printf("They feel good! Energy left: %.2f", energyLostPerDancer);
        } else {
            System.out.printf("They are wasted! Energy left: %.2f", energyLostPerDancer);
        }

    }
}