import java.util.Scanner;

public class E_170917_P06_TheSongOfTheWheels {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int count = 0;
        String pass = "";


        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        if (n == a * b + c * d) {
                            if (a < b && c > d) {
                                System.out.print("" + a + b + c + d + " ");
                                count++;
                                if (count == 4) {
                                    pass = ("" + a + b + c + d);
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println();
        if (!pass.equals("")) {
            System.out.println("Password: " + pass);

        } else {
            System.out.println("No!");
        }
    }
}

