package algorithm;

import java.util.*;
import java.io.*;
import java.util.Arrays.*;
public class Algo45 {

    public static void m1ain(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] distances = new int[N];
        int distanceSum = 0;
        for (int i = 0; i < N; i++) {
            distances[i] = sc.nextInt();
            distanceSum += distances[i];
        }
        int pairIndex = 0;
        int distClockWise = 0;
        int distCountClockWise = distanceSum;
        int ans = 0;
        for (int i = 0; i < N; i++) {
            while(distClockWise < distCountClockWise){
                distClockWise += distances[pairIndex];
                distCountClockWise -= distances[pairIndex];
                pairIndex = (pairIndex + 1) % N;
            }
            ans = Math.max(ans, distCountClockWise);
            distClockWise -= distances[i];
            distCountClockWise += distances[i];
        }
        System.out.println(ans);

    }


}
