import java.text.DecimalFormat;
import java.util.Scanner;

public class P11_Odd_EvenPosition {


    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##########");

        int n = Integer.parseInt(console.nextLine());
        double oddSum = 0;
        double evenSum = 0;
        double minOddNumber = Integer.MAX_VALUE;
        double maxOddNumber = Integer.MIN_VALUE;
        double minEvenNumber = Integer.MAX_VALUE;
        double maxEvenNumber = Integer.MIN_VALUE;


        for (int i = 1; i < n + 1; i++) {
            double currentNumber = Double.parseDouble(console.nextLine());
            if (i % 2 != 0) {
                oddSum += currentNumber;
                if (currentNumber > maxOddNumber) {
                    maxOddNumber = currentNumber;
                }
                if (currentNumber < minOddNumber) {
                    minOddNumber = currentNumber;
                }
            } else {
                evenSum += currentNumber;
                if (currentNumber > maxEvenNumber) {
                    maxEvenNumber = currentNumber;
                }
                if (currentNumber < minEvenNumber) {
                    minEvenNumber = currentNumber;
                }
            }
        }
        if (n == 0) {
            System.out.println("OddSum =" + df.format(oddSum) + ",");
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
            System.out.println("EvenSum =" + df.format(evenSum) + ",");
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        }else if (n==1){
            System.out.println("OddSum =" + df.format(oddSum) + ",");
            System.out.println("OddMin =" + df.format(minOddNumber) + ",");
            System.out.println("OddMax =" + df.format(maxOddNumber) + ",");
            System.out.println("EvenSum =" + df.format(evenSum) + ",");
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");

        } else {
            System.out.println("OddSum =" + df.format(oddSum) + ",");
            System.out.println("OddMin =" + df.format(minOddNumber) + ",");
            System.out.println("OddMax =" + df.format(maxOddNumber) + ",");
            System.out.println("EvenSum =" + df.format(evenSum) + ",");
            System.out.println("EvenMin =" + df.format(minEvenNumber) + ",");
            System.out.println("EvenMax =" + df.format(maxEvenNumber));

        }
    }

}

