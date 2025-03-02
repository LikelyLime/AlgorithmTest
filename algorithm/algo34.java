package algorithm;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class algo34 {
    public static void main1(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int[] sums = new int[N * (N + 1) / 2];
        int sumsIndex = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i; j < N; j++) {
                sums[sumsIndex++] = arr[i] + arr[j];
            }
        }
        Arrays.sort(sums);
        int ans = -1;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int target = arr[i] - arr[j];
                if(Arrays.binarySearch(sums, target) >= 0) {
                    ans = Math.max(ans, arr[i]);
                }
            }
        }
        System.out.println(ans);

    }
}
