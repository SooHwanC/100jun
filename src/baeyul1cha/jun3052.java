package baeyul1cha;

import java.util.Arrays;
import java.util.Scanner;

public class jun3052 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = scan.nextInt() % 42;
        }

        arr = Arrays.stream(arr).distinct().toArray();

        System.out.println(arr.length);

    }

}
