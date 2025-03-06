package algorithm;

import java.io.IOException;
import java.util.Scanner;

public class algo37 {
    public static void main1(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Integer[] tree = new Integer[N];
        for (int i = 0; i < N; i++) {
            tree[i] = sc.nextInt();
        }
        int l = 0,r = 1000000000, ans = -1;
        while (l <= r) {
            int m = (l + r) / 2;
            if(isPossible(tree, m, M)){
                ans = m;
                l = m + 1;
            }else{
                r = m - 1;
            }
        }
        System.out.println(ans);
    }
    static boolean isPossible(Integer[] tree, int m, int M) {
        long sum = 0;
        for(int h : tree){
            if(h > m){
                sum += h - m;
            }
        }
        return sum >= M;
    }
}
