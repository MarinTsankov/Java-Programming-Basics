import java.util.Scanner;

public class P11_EqualWords {


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        String firstWord = console.nextLine();
        String secondWord = console.nextLine();
        firstWord = firstWord.toLowerCase();
        secondWord = secondWord.toLowerCase();


        if (firstWord.equals(secondWord)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }


    }
}
