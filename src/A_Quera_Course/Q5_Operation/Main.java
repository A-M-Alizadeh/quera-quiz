package A_Quera_Course.Q5_Operation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];
        float min,max,sum;
        double multi;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        min = numbers[0];
        max = numbers[0];
        sum = numbers[0];
        multi = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i] > max){
                max = numbers[i];
            }
            if(numbers[i] < min){
                min = numbers[i];
            }
            sum = numbers[i]+sum;
            multi = numbers[i]*multi;
        }

        System.out.printf("Sum : %.6f\n", sum);
        System.out.printf("Average : %.6f\n", sum/4);
        System.out.printf("Product : %.6f\n", multi);
        System.out.printf("MAX : %.6f\n", max);
        System.out.printf("MIN : %.6f\n", min);
    }
}
