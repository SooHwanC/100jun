package baeyul1cha;

import java.util.Scanner;

public class jun10811 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int arr[] = new int[scan.nextInt()];

        int num = scan.nextInt();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int i = 0; i < num; i++) {
            int num1 = scan.nextInt() - 1;
            int num2 = scan.nextInt() - 1;
            if (num1 == num2) {
            } else {
                for (int j = num2 - 1; j < num2; j--) {
                    int temp = 0;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    for (int k = j + 1; k < num2; k++) {
                        int temp2 = 0;
                        temp2 = arr[k + 1];
                        arr[k + 1] = arr[k];
                        arr[k] = temp2;
                    }
                    if (j == num1) {
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
