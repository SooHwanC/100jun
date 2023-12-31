package baeyul1cha;

import java.util.Scanner;

public class jun10807 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int arrcount = scan.nextInt();

        int[] arr = new int[arrcount];

        for (int i = 0; i < arrcount; i++) {
            arr[i] = scan.nextInt();
        }

        int wnum = scan.nextInt();

        int count = 0;

        for (int i = 0; i < arrcount; i++) {
            if (arr[i] == wnum) {
                count++;
            }
        }

        System.out.println(count);
    }

}
