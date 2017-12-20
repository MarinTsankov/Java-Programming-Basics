import java.util.Scanner;

public class E_201116_P06_MaxCombination {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int beginning = Integer.parseInt(console.nextLine());
        int end = Integer.parseInt(console.nextLine());
        int maxNumCombination = Integer.parseInt(console.nextLine());
        int count = 0;


        for (int i = beginning; i <= end; i++) {
            for (int j = beginning; j <= end; j++) {
                count++;
                if (count <= maxNumCombination) {
                    System.out.print("" + "<" + i + "-" + j + ">");
                } else {
                    break;
                }

            }

        }


    }
}
