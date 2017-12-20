import java.util.Scanner;

public class E_030917_P06_Profit {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int coins1Lv = Integer.parseInt(console.nextLine());
        int coins2Lv = Integer.parseInt(console.nextLine());
        int bills5Lv = Integer.parseInt(console.nextLine());
        int sum = Integer.parseInt(console.nextLine());
        int temp = 0;
        int temp1 = 0;
        int temp2 = 0;


        for (int i = 0; i <= coins1Lv; i++) {
            temp = i;
            for (int j = 0; j <= coins2Lv; j++) {
                temp1 = j * 2;
                for (int k = 0; k <= bills5Lv; k++) {
                    temp2 = k * 5;
                    if (sum == temp + temp1 + temp2) {
                        System.out.println(i + " * 1 lv." + " + " + j + " * 2 lv." + " + " + k + " * 5 lv." + " = " + sum + " lv.");
                    }
                }

            }
        }
    }
}
