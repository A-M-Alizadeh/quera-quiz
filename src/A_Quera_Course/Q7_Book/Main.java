package A_Quera_Course.Q7_Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        double sum=0;

        for (int i = 0; i < n+1; i++) {
            sum+= Math.min(i,n-i);
        }
        System.out.println(sum / (n + 1));
    }
}
