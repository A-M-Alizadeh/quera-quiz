package A_Quera_Course.Q7_Book;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Masoud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((IntStream.range(1, n / 2 + 1).parallel().map(i -> Math.min(i, n - i)).sum() * 2 - ((1 - n % 2) * n / 2)) / (n + 1.0));
    }
}
