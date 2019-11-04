package A_Quera_Course.Q10_ReverseComparison;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        if ( Revert(number1) ==  Revert(number2) ) {
            System.out.println(number1 + " = " + number2);
        }
        else if (Revert(number1) <  Revert(number2) ) {
            System.out.println(number1 + " < " + number2);
        }
        else {
            System.out.println(number2 + " < " + number1);
        }

    }

    public static int Revert(int num){
        int reversed=0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
