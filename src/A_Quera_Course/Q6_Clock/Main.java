package A_Quera_Course.Q6_Clock;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mirrorHour=scanner.nextInt(), mirrorMinute=scanner.nextInt();
        int realHour,realMinute;

        if (mirrorHour == 0){
            realHour = 0;
        }else {
            realHour = 12-mirrorHour;
        }

        if (mirrorMinute == 0){
            realMinute = 0;
        }else {
            realMinute = 60-mirrorMinute;
        }

        System.out.printf("%02d:%02d", realHour, realMinute);

    }
}
