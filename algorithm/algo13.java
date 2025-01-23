package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class algo13 {
    public static void main1(String[] args){

        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();

        while(cnt-- > 0){
            int N = sc.nextInt();
            boolean ans = false;
            for(int i = 2; i <= 64; i++){
                int[] digit = convertBase(N , i);
                if(isPalindrome(digit)){
                    ans = true;
                    break;
                }
            }
            System.out.println(ans ? "1" : "0");
        }
    }

    private static boolean isPalindrome(int[] digit) {
        for(int i = 0; i < digit.length / 2; i++){
            if(digit[i] != digit[digit.length - i - 1]){
                return false;
            }
        }
        return true;
    }

    private static int[] convertBase(int n, int i) {
        int len = 0, copyN = n;
        while(copyN > 0){
            copyN /= i;
            len++;
        }
        int[] digit = new int[len];
        len = 0;
        while(n > 0){
            digit[len++] = n % i;
            n = n / i;
        }
        return digit;
    }
}

