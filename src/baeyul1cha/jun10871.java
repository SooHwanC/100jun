package baeyul1cha;

import java.util.ArrayList;
import java.util.Scanner;

public class jun10871 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int arrcount = scan.nextInt();
        int arrlimit = scan.nextInt();

        int arr[] = new int[arrcount];

        for (int i = 0; i < arrcount; i++) {
            arr[i] = scan.nextInt();
            if (arr[i] < arrlimit) {
                System.out.println(arr[i]);
            }
        }
    }

}
