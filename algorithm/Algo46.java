package algorithm;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Algo46 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] arr = new int[A + B];
        int[] arrA = new int[A];
        int[] arrB = new int[B];
        for (int i = 0; i < A; i++) {
            arrA[i] = sc.nextInt();
        }
        for (int i = 0; i < B; i++) {
            arrB[i] = sc.nextInt();
        }
        int idxA = 0;
        int idxB = 0;
        int idx = 0;
        while (idxA < A && idxB < B) {
            if (arrA[idxA] < arrB[idxB]) {
                arr[idx++] = arrA[idxA++];
            } else {
                arr[idx++] = arrB[idxB++];
            }
        }
        while(idxA < A){arr[idx++] = arrA[idxA];};
        while(idxB < B){arr[idx++] = arrB[idxB];};

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < A + B; i++) {
            bw.write(arr[i] + " ");
        }
        bw.flush();
        bw.close();
    }
    public void explain() throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int[] arr = new int[A + B];
        for (int i = 0; i < A + B; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < A + B; i++) {
            bw.write(arr[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}
