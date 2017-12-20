import java.util.Scanner;

public class P12_CurrencyConverter {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double moneyToConvert = Double.parseDouble(console.nextLine());
        String firstCurrency = console.nextLine();
        String secondCurrency = console.nextLine();

        double firstRate = 0.0;
        double secondRate = 0.0;

        if (firstCurrency.equals("BGN")) {

            firstRate = 1;
        } else if (firstCurrency.equals("USD")) {

            firstRate = 1.79549;
        } else if (firstCurrency.equals("EUR")) {

            firstRate = 1.95583;
        }else if (firstCurrency.equals("GBP")){

            firstRate = 2.53405;
        }

        if (secondCurrency.equals("BGN")) {

            secondRate = 1;
        } else if (secondCurrency.equals("USD")) {

            secondRate = 1.79549;
        } else if (secondCurrency.equals("EUR")) {

            secondRate = 1.95583;
        }else if (secondCurrency.equals("GBP")){

            secondRate = 2.53405;
        }

        double result = moneyToConvert *(firstRate/secondRate);
        System.out.printf("%.2f %S",result,secondCurrency);


    }
}
