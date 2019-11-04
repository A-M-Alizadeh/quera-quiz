package A_Quera_Course.Q14_Khararat_Swim;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x=scanner.nextInt(),y=scanner.nextInt();
        if (x%2==0){
            if (x == y || y == x-2){
                System.out.println(x+y);
            }else {
                System.out.println("-1");
            }
        }
        else if (x%2!=0){
            if (x == y || y == x-2){
                System.out.println(x+y-1);
            }else {
                System.out.println("-1");
            }
        }
    }
}
