package algorithm;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class algo32 {
    public static void main1(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        Arrays.sort(arr);
        for(int i = 0; i < M; i++) {
            System.out.println(Arrays.binarySearch(arr, sc.nextInt()) >= 0 ? 1 : 0);
        }
    }
}
