package algorithm;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class algo9 {
    public static void main1(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int line = Integer.parseInt(br.readLine());
        int[] sorted = new int[10001];
        for(int i = 0; i < line; i++){
            sorted[Integer.parseInt(br.readLine())]++;
        }
        for(int i = 0; i <= 10000; i++){
            while(sorted[i]-- > 0){
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();

    }
}
