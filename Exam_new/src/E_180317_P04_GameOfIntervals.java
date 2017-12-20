import java.util.Scanner;

public class E_180317_P04_GameOfIntervals {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double peopleCount = Double.parseDouble(console.nextLine());
        double num0To9Count = 0;
        double num10To19Count = 0;
        double num20To29Count = 0;
        double num30To39Count = 0;
        double num40To50Count = 0;
        double invalidNumbersCount = 0;
        double extraPoints = 0;

        for (int i = 1; i <= peopleCount; i++) {
            double numbers = Double.parseDouble(console.nextLine());
            if (numbers < 0 || numbers > 50) {
                extraPoints /= 2;
                invalidNumbersCount++;
            }
            if (numbers >= 0 && numbers <= 9) {
                extraPoints += numbers * 0.20;
                num0To9Count++;
            }
            if (numbers >= 10 && numbers <= 19) {
                extraPoints += numbers * 0.30;
                num10To19Count++;
            }
            if (numbers >= 20 && numbers <= 29) {
                extraPoints += numbers * 0.40;
                num20To29Count++;
            }
            if (numbers >= 30 && numbers <= 39) {
                extraPoints += 50;
                num30To39Count++;
            }
            if (numbers >= 40 && numbers <= 50) {
                extraPoints += 100;
                num40To50Count++;
            }

        }

        System.out.printf("%.2f%nFrom 0 to 9: %.2f%%" +
                        "%nFrom 10 to 19: %.2f%%" +
                        "%nFrom 20 to 29: %.2f%%" +
                        "%nFrom 30 to 39: %.2f%%" +
                        "%nFrom 40 to 50: %.2f%%" +
                        "%nInvalid numbers: %.2f%%", extraPoints, num0To9Count / peopleCount * 100
                , num10To19Count / peopleCount * 100, num20To29Count / peopleCount * 100, num30To39Count / peopleCount * 100
                , num40To50Count / peopleCount * 100, invalidNumbersCount / peopleCount * 100);
    }
}
