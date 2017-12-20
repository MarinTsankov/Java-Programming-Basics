import java.util.Scanner;

public class P08_OddEvenSum {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int sum1 = 0;
        int sum2 = 0;


        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(console.nextLine());

            if (i % 2 == 0) {
                sum1 += num;

            } else {
                sum2 += num;
            }

        }
        if (sum1 == sum2){
            System.out.printf("Yes Sum = %d",sum1);
        }else {
            System.out.printf("No Diff = %d",Math.abs(sum1-sum2));
        }
    }
}
