package A_Quera_Course.Q4_Road;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println( ((num/2)+1)*(((num+1)/2)+1) );
    }
}
