import java.util.Scanner;

public class E_190317_P06_ControlNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int N = Integer.parseInt(console.nextLine());
        int M = Integer.parseInt(console.nextLine());
        int controlNum = Integer.parseInt(console.nextLine());
        int sum = 0;
        int count = 0;

        for (int i = 1; i <= N; i++) {
            for (int j = M; j >= 1; j--) {
                sum += i * 2 + j * 3;
                count++;
                if (sum >= controlNum) {
                    break;
                }
            }
            if (sum >= controlNum) {
                break;
            }
        }
        if (sum >= controlNum) {
            System.out.printf("%d moves%nScore: %d >= %d", count, sum, controlNum);
        } else {
            System.out.printf("%d moves", count);
        }
    }
}

