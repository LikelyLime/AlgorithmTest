package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main1(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        char[][] map = new char[N][N];
        for(int i = 0; i < N; i++){
            map[i] = sc.next().toCharArray();
        }
        int ans = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(j + 1 < N && map[i][j] != map[i][ j + 1 ]){
                    swapCandy(map, i ,j , i, j + 1);
                    ans = Math.max(ans, Math.max(maxColumn(map), findMaxRow(map)));
                    swapCandy(map, i ,j , i, j + 1);
                }
                if(i + 1 < N && map[i][j] != map[ i + 1 ][j]){
                    swapCandy(map, i ,j , i + 1, j);
                    ans = Math.max(ans, Math.max(maxColumn(map), findMaxRow(map)));
                    swapCandy(map, i ,j , i + 1, j);
                }
            }
        }
        System.out.println(ans);
    }

    private static int maxColumn(char[][] map) {
        int N = map.length;
        int maxColum = 0;
        for(int c = 0; c < N; c++){
            int len = 1;
            for(int r = 1; r < N; r++){
                if(map[r][c] == map[r - 1][c]){
                    len++;
                }else{
                    maxColum = Math.max(maxColum, len);
                    len = 1;
                }
            }
            maxColum = Math.max(maxColum, len);
        }
        return maxColum;
    }

    private static int findMaxRow(char[][] map) {
        int N = map.length;
        int maxRow = 0;
        for(int r = 0; r < N; r++){
            int len = 1;
            for(int c = 1; c < N; c++){
                if(map[r][c] == map[r][c - 1]){
                    len++;
                }else{
                    maxRow = Math.max(maxRow, len);
                    len = 1;
                }
            }
            maxRow = Math.max(maxRow, len);
        }
        return maxRow;
    }

    private static void swapCandy(char[][] map, int r1, int c1, int r2, int c2) {
        char temp = map[r1][c1];
        map[r1][c1] = map[r2][c2];
        map[r2][c2] = temp;
    }
}

