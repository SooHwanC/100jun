package baeyul1cha;

import java.util.Scanner;

public class jun10810 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int maxnum = scan.nextInt();
        int linenum = scan.nextInt();

        int arr[] = new int[maxnum];

        for (int i = 0; i < linenum; i++) {

            int num1 = scan.nextInt();
            int num2 = scan.nextInt();
            int num3 = scan.nextInt();

            for (int j = num1 - 1; j <= num2 - 1; j++) {
                arr[j] = num3;
            }
        }

        for (int i = 0; i < maxnum; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
