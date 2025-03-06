package algorithm;

import java.io.IOException;
import java.util.Scanner;

public class algo38 {
    public static void mai1n(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] lines = new int[N];

        for (int i = 0; i < N; i++) {
            lines[i] = sc.nextInt();
        }
        long l = 1, r = (1L << 31) - 1, ans = -1;
        while(l <= r){
            long m = (l + r) / 2;
            if(calculateCount(lines, m) >= M){
                l = m + 1;
                ans = m;
            }else{
                r = m - 1;
            }
        }
        System.out.println(ans);

    }
    static int calculateCount(int[] lengths, long cutLength) {
        int count = 0;
        for(int length : lengths){
            count += length / cutLength;
        }
        return count;
    }
}
