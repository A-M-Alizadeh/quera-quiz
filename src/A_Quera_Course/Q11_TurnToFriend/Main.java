package A_Quera_Course.Q11_TurnToFriend;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x0 = scanner.nextInt();
        int y0 = scanner.nextInt();
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        if (x1>x0){
            System.out.println("Right");
        }else {
            System.out.println("Left");
        }
    }
}
