package A_Quera_Course.Q15_PoopakSleep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a=scanner.nextInt(),b=scanner.nextInt(),x=scanner.nextInt();
        int AccabtableMatches=0;

        List<Integer> A_numbers = new ArrayList<Integer>();
        List<Integer> B_numbers = new ArrayList<Integer>();

        for (int i = 1; i <= a; i++) {
            if (a%i == 0){
                A_numbers.add(i);
            }
        }
        for (int i = 1; i <= b; i++) {
            if (b%i == 0){
                B_numbers.add(i);
            }
        }

        for (int i = 0; i < A_numbers.size(); i++) {
            for (int j = 0; j < B_numbers.size(); j++) {
                if (A_numbers.get(i)+B_numbers.get(j) <= x){
                    AccabtableMatches++;
                }
            }
        }
        System.out.println(AccabtableMatches);
    }
}
