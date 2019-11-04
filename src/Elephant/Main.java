package Elephant;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x_ban,y_ban,blocked_cells,x_suggest,y_suggest;

        x_ban = scanner.nextInt();
        y_ban = scanner.nextInt();

        if (x_ban==7 && y_ban==7){
            blocked_cells = 1;

            x_suggest = 2;
            y_suggest = 2;

        }else {
            blocked_cells = 1;
            x_suggest = 7;
            y_suggest = 7;
        }

        System.out.println(blocked_cells);
        for (int i = 0; i < blocked_cells; i++) {
            System.out.println(x_suggest + " " + y_suggest);
        }


        scanner.close();
    }
}
