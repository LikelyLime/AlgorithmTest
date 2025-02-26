package algorithm;

import java.io.IOException;
import java.util.Scanner;

public class algo26 {
    public static void main1(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = sc.nextInt();
        int[] acc = new int[N + 1];
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            int num = sc.nextInt();
            sum += num;
            acc[i] = sum;
        }

        for (int i = 0; i < count; i++) {
            int idx1 = sc.nextInt();
            int idx2 = sc.nextInt();

            System.out.println(acc[idx2] - acc[idx1 - 1]);
        }
    }
}
