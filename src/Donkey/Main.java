package Donkey;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int L = scanner.nextInt();
        int time=0;
        if(L%2 ==0){
            time = (L/2)*(a+b);
        }else {
            time = (L/2)*(a+b)+a;
        }

        System.out.println(time);
    }
}
