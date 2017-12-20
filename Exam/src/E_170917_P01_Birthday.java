import java.util.Scanner;

public class E_170917_P01_Birthday {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int lenght = Integer.parseInt(console.nextLine());
        int weight = Integer.parseInt(console.nextLine());
        int hight = Integer.parseInt(console.nextLine());
        double percent = Double.parseDouble(console.nextLine());

        double area = lenght * weight * hight;
        double totalLiters = area * 0.001;
        double totalPercent = totalLiters - (totalLiters*percent*0.01);

        System.out.printf("%.3f",totalPercent);

    }
}
