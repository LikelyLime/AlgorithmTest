package algorithm;

import java.util.*;
import java.io.*;
import java.util.Arrays.*;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int[] xs = new int[N];

        for (int i = 0; i < N; i++) {
            xs[i] = sc.nextInt();
        }
        Arrays.sort(xs);
        int l = 1, r = xs[N - 1] - xs[0], ans = -1;
        while(l <= r){
            int m = (l + r) / 2;
            if(calculate(xs, m) >= C){
                l = m + 1;
                ans = m;
            }else{
                r = m - 1;
            }
        }
        System.out.println(ans);

    }
    static int calculate(int[] xs, int distance) {
        int pastX = xs[0];
        int cnt = 1;
        for(int i = 1; i < xs.length; i++){
            if(xs[i] - pastX >= distance){
                pastX = xs[i];
                cnt++;
            }
        }
        return cnt;
    }

}

