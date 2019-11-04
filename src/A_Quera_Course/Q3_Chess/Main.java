package A_Quera_Course.Q3_Chess;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenKing=scanner.nextInt(),givenQueen=scanner.nextInt(),givenRooks=scanner.nextInt(),givenBishops=scanner.nextInt(),givenKnights=scanner.nextInt(),givenPawns=scanner.nextInt();
        System.out.println((1-givenKing)+" "+(1-givenQueen)+" "+(2-givenRooks)+" "+(2-givenBishops)+" "+(2-givenKnights)+" "+(8-givenPawns));
    }
}
