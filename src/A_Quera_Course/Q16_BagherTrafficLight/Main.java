package A_Quera_Course.Q16_BagherTrafficLight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt(),l=scanner.nextInt();
        int time=0,redTime;
        int [][] lightsList = new int[n][3];
        for (int i = 0; i < n; i++) {
            lightsList[i][0]=scanner.nextInt();
            lightsList[i][1]=scanner.nextInt();
            lightsList[i][2]=scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
//            int total=0,j=0;
//            for (j = 0; total<=time; j++) {
//                if (i%2==0){
//                    total+=lightsList[j][1];
//                }else {
//                    total+=lightsList[i][2];
//                }
//
//                System.out.println(total);
//                System.out.println("--------------------------------\n");
//            }
        }

    }
}
