package algorithm;

import java.util.*;
import java.io.*;
import java.util.Arrays.*;
public class Algo42 {
    public static void m1ain(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int j = 0;
        int ans = N + 1;
        int currentSum = arr[0];
        for (int i = 0; i < N; i++) {
            while (currentSum < S && j < N - 1){
                currentSum += arr[++j];
            }
            if(currentSum >= S){
                ans = Math.min(ans, j - i + 1);

            }
            currentSum -= arr[i];
        }
        if(ans > N){
            ans = 0;
        }
        System.out.println(ans);
    }

}

