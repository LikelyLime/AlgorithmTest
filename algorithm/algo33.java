package algorithm;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class algo33 {
    static boolean isExist(String[] arr, String x){
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            int cmp = arr[m].compareTo(x);
            if (cmp < 0) {
                l = m + 1;
            }else if (cmp > 0) {
                r = m - 1;
            }else{
                return true;
            }
        }
        return false;
    }
    public static void main1(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];
        int M = sc.nextInt();
        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }
        Arrays.sort(arr);
        int ans = 0;
        for (int i = 0; i < M; i++) {
            if(Arrays.binarySearch(arr, sc.next()) >= 0) {
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
