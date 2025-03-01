package algorithm;

import java.io.IOException;
import java.util.Scanner;

public class algo30 {
    public static void main1(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }

        int[] delta = new int[N + 2];
        while(M-- > 0){
            int start = sc.nextInt();
            int end = sc.nextInt();
            int count = sc.nextInt();
            delta[start] += count;
            delta[end + 1] -= count;
        }
        int[] accDelta = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            accDelta[i] =  accDelta[i - 1] + delta[i];
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(arr[i] + accDelta[i] + " ");
        }

    }
}
