package algorithm;

import java.util.*;
import java.io.*;
import java.util.Arrays.*;
public class algo41 {
    public static void mai1n(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int j = 0;
        int ans = 0;
        int currentSum = arr[0];
        for (int i = 0; i < N; i++) {
            while (currentSum < M && j < N - 1){
                currentSum += arr[++j];
            }
            if(currentSum == M){
                ans++;
            }
            currentSum -= arr[i];
        }

        System.out.println(ans);

    }


}