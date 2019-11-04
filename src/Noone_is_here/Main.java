package Noone_is_here;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String [][] days = new String[][]{{"shanbe","1"},{"1shanbe","1"},{"2shanbe","1"},{"3shanbe","1"},{"4shanbe","1"},{"5shanbe","1"},{"jome","1"}};
        Scanner scanner = new Scanner(System.in);

        int days_left=0;
        String[] firstP_days,secondP_days,thirdP_days;

        scanner.nextInt();
        scanner.nextLine();
        firstP_days = scanner.nextLine().split(" ");

        scanner.nextInt();
        scanner.nextLine();
        secondP_days = scanner.nextLine().split(" ");


        scanner.nextInt();
        scanner.nextLine();
        thirdP_days = scanner.nextLine().split(" ");



        for (int i = 0; i < firstP_days.length; i++) {
            for (int j = 0; j < days.length; j++) {
                if (firstP_days[i].equals(days[j][0])){
                    days[j][1] = "0";
                }
            }
        }
        for (int i = 0; i < secondP_days.length; i++) {
            for (int j = 0; j < days.length; j++) {
                if (secondP_days[i].equals(days[j][0])){
                    days[j][1] = "0";
                }
            }
        }
        for (int i = 0; i < thirdP_days.length; i++) {
            for (int j = 0; j < days.length; j++) {
                if (thirdP_days[i].equals(days[j][0])){
                    days[j][1] = "0";
                }
            }
        }

        for (int i = 0; i < days.length; i++) {
            if (days[i][1].equals("1"))
                days_left++;
        }

        System.out.println(days_left);
    }
}
