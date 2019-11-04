package A_Quera_Course.Q18_SnapShekarestan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt(),m=scanner.nextInt();

        int[][] trips=new int[m][n];

        int sum=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                trips[i][j]=scanner.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            sum+=trips[scanner.nextInt()-1][scanner.nextInt()-1];
        }

        System.out.println(sum);
    }
}
