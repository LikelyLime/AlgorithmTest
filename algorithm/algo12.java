package algorithm;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class algo12 {
    public static void main1(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        String ans = "";
        //1. N을 B로 나눈 나머지를 구하고, B로 나누자
        while(N > 0){
            int D = N % B;
            if(D < 10){
                ans += D;
            }else{
                ans += (char)(D - 10 + 'A');
            }
            N = N / B;
        }
        //2. 이때 가장 마지막 나머지부터 출력
        for(int i = ans.length() - 1; i >= 0; i--){
            System.out.print(ans.charAt(i));
        }



    }
}

