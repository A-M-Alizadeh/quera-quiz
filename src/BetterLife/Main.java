package BetterLife;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        int seat;

        if(column <=10) {
            System.out.print("Right ");
            seat = column;
        }
        else {
            System.out.print("Left ");
            seat = 21 - column;
        }

        System.out.print(11-row+" "+seat);


    }
}
