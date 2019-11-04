package Camera;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xmin,xmax,ymin,ymax;
        int[][] dimens = new int[3][2];
        boolean flag = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                dimens[i][j] = scanner.nextInt();
            }
        }
        xmin = dimens[0][0];
        xmax = dimens[1][0];

        ymax = dimens[0][1];
        ymin = dimens[1][1];
        for (int i = 0; i < 3; i++) {
            if (dimens[i][0] > xmax){
                xmax = dimens[i][0];
            }
            if (dimens[i][0] < xmin){
                xmin = dimens[i][0];
            }
        }

        for (int i = 0; i < 3; i++) {
            if (dimens[i][1] > ymax){
                ymax = dimens[i][1];
            }
            if (dimens[i][1] < ymin){
                ymin = dimens[i][1];
            }
        }

        int[][] estimatedDimens = new int[][]{{xmin,ymin},{xmax,ymin},{xmin,ymax},{xmax,ymax}};

        int j;
        for (int i = 0; i < estimatedDimens.length; i++) {
            for (j = 0; j < dimens.length; j++) {
                if(dimens[j][0]==estimatedDimens[i][0] && dimens[j][1]==estimatedDimens[i][1]){
                    flag = true;
                }
            }
            if (j == 3 && !flag){
                System.out.println(estimatedDimens[i][0]+" "+estimatedDimens[i][1]);
            }else {
                flag = false;
            }

        }

    }
}
