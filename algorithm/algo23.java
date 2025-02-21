package algorithm;

import java.util.*;
import java.io.*;

public class algo23 {
    public static void main1(String[] args) throws IOException {

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] xs = new int[N];
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < N; i++) {
            xs[i] = sc.nextInt();
            set.add(xs[i]);
        }
        Map<Integer, Integer> sortedIndex = new HashMap<>();
        int idx = 0;
        for(int x : set){
            sortedIndex.put(x,idx++);
        }

        for(int i =0; i < N; i++){
            bw.write(sortedIndex.get(xs[i]) + " ");
        }
        bw.flush();
//        bw.close();

    }
}