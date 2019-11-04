package A_Quera_Course.Q17_Blindness;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String correctWord = scanner.nextLine(),studentWord = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (correctWord.charAt(i) != studentWord.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
