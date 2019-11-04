package Wow;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        System.out.print("W");
        for (int i = 0; i < length; i++) {
            System.out.print("o");
        }
        System.out.print("w!");
    }
}
