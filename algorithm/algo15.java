package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class algo15 {
    public static void main1(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num-- > 0){
            int h = sc.nextInt();
            int w = sc.nextInt();
            int N = sc.nextInt();
            int floor = ((N - 1) % h) + 1;
            int distance = (N - 1) / h + 1;
            System.out.printf("%d%02d\n", floor, distance);
        }

    }
}