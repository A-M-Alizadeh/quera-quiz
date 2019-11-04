package ReverseWords;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arrLength;
        arrLength = scanner.nextInt();
        scanner.nextLine();

        String line;
        String[] words;
        line = scanner.nextLine();
        words = line.split(" ");

        for (int i = arrLength-1; i >= 0; i--) {
            System.out.print(words[i]+" ");
        }

        scanner.close();
    }
}
