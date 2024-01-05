package baeyul1cha;

import java.util.Scanner;

public class jun10813 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < m; i++) {
            int first = scan.nextInt();
            int seccond = scan.nextInt();

            int temp = arr[first - 1];
            arr[first - 1] = arr[seccond - 1];
            arr[seccond - 1] = temp;

        }

        for (int i = 0; i < n; i++) {

            System.out.print(arr[i] + " ");
        }

    }

}
