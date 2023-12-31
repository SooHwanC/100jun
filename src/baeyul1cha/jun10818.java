package baeyul1cha;

import java.util.Arrays;
import java.util.Scanner;

public class jun10818 {

    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();

        int arr[] = new int[count];

        for (int i = 0; i < count; i++) {
            arr[i] = scan.nextInt();
        }

        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println(min);
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);

    }

}
