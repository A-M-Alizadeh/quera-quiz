package A_Quera_Course.Q9_LiteFite;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] colors = scanner.nextLine().toCharArray();
        int yellows=0,reds=0,greens=0;
        for (int i = 0; i < colors.length; i++) {
            if (colors[i] == 'R')
                reds++;
            else if (colors[i] == 'Y')
                yellows++;
            else greens++;
        }

        if (reds>=3 || (yellows>=2 && reds>=2) || greens==0){
            System.out.println("nakhor lite");
        }else {
            System.out.println("rahat baash");
        }
    }
}
