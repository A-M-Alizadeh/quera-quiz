package Weight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int weight;
        float height,BMI;
        weight = scanner.nextInt();
        scanner.nextLine();
        height = scanner.nextFloat();

        BMI = (weight)/((height)*(height));
        if (BMI < 18.5){
            System.out.printf("%.2f",BMI);
            System.out.println("\nUnderweight");
        }else if (BMI>=18.5 && BMI<25){
            System.out.printf("%.2f",BMI);
            System.out.println("\nNormal");
        }else if (BMI>=25 && BMI<30){
            System.out.printf("%.2f",BMI);
            System.out.println("\nOverweight");
        }else{
            System.out.printf("%.2f",BMI);
            System.out.print("\nObese");
        }
    }
}
