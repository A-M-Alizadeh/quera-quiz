package TShirt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[] = new int[4];
        for (int i = 0; i < 4; i++) {
            if (i==2)
                scanner.nextLine();

            arr[i] = scanner.nextInt();
        }

        if (arr[0]>=arr[1] && arr[2]>=arr[3]){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}
