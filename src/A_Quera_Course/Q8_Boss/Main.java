package A_Quera_Course.Q8_Boss;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int y1=scanner.nextInt(),x1=scanner.nextInt(),y2=scanner.nextInt(),x2=scanner.nextInt();
        if (x1 == x2){
            System.out.println("Horizontal");
        }else if(y1 == y2){
            System.out.println("Vertical");
        }else {
            System.out.println("Try again");
        }
    }
}
