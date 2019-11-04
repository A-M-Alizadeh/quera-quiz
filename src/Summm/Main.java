package Summm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long entry = scanner.nextLong();
        long tempEntry;
        char[] temp;

        while (entry > 9){
            tempEntry = 0;
            temp = String.valueOf(entry).toCharArray();
            for (int i = 0; i < temp.length; i++) {
                tempEntry+=Character.getNumericValue(temp[i]);
            }
            entry = tempEntry;
        }
        System.out.println(entry);
    }
}
