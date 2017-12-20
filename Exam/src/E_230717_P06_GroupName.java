import java.util.Scanner;

public class E_230717_P06_GroupName {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine().toUpperCase();
        String second = scanner.nextLine().toLowerCase();
        String third = scanner.nextLine().toLowerCase();
        String fourth = scanner.nextLine().toLowerCase();
        String num = scanner.nextLine();
        int count = 0;
        String name = first + second + third + fourth + num;

        char n1 = name.charAt(0);
        char n2 = name.charAt(1);
        char n3 = name.charAt(2);
        char n4 = name.charAt(3);
        char n5 = name.charAt(4);


        for (char i = 'A'; i <= n1; i++) {
            for (char j = 'a'; j <= n2; j++) {
                for (char k = 'a'; k <= n3; k++) {
                    for (char l = 'a'; l <= n4; l++) {
                        for (char m = '0'; m <= n5; m++) {
                            //String temp = String.valueOf(i) + String.valueOf(j) + String.valueOf(k) + String.valueOf(l) + String.valueOf(m);
                            if (i == n1 && j == n2 && k == n3 && l == n4 && m == n5) {
                                break;
                                //if (name.equals(temp)) {
                            }
                            count++;
                        }

                    }
                }
            }
        }
        System.out.println(count);
    }

}

