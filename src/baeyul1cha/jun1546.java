package baeyul1cha;

import java.util.Arrays;
import java.util.Scanner;

public class jun1546 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int arr[] = new int[scan.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }

        double max = Arrays.stream(arr).max().getAsInt();
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg += ((arr[i] / max) * 100);
        }

        System.out.println(avg / arr.length);

    }
}
