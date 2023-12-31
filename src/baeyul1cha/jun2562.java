package baeyul1cha;

import java.util.Arrays;
import java.util.Scanner;

public class jun2562 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int arr[] = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = scan.nextInt();
        }

        int max = Arrays.stream(arr).max().getAsInt();

        int index = 0;

        for (int i = 0; i < 9; i++) {
            if (arr[i] == max) {
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);

    }

}
