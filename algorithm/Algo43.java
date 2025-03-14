package algorithm;

import java.util.*;
import java.io.*;
import java.util.Arrays.*;
public class Algo43 {
    public static void main2(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int j = 0;
        int ans = arr[N - 1] - arr[0];
        for (int i = 0; i < N; i++) {
            while (arr[j] - arr[i] < M && j < N - 1){
                j++;
            }
            int diff = arr[j] - arr[i];
            if (diff >= M){
                ans = Math.min(diff, ans);
            }
        }
        //시간 복잡도 NlongN
        System.out.println(ans);
    }

}

