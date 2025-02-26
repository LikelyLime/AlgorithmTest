package algorithm;

import java.io.IOException;
import java.util.Scanner;

public class algo27 {
    public static void main1(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = sc.nextInt();
        int[] arr = new int[N + 1];
        int[] acc = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i <= N; i++) {
            acc[i] = acc[i - 1] ^ arr[i];
        }
        int ans = 0;
        for (int i = 0; i < count; i++) {
            int idx1 = sc.nextInt();
            int idx2 = sc.nextInt();
            ans ^= acc[idx2] ^ acc[idx1 - 1];

        }
        System.out.println(ans);
    }
}
