package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class algo16 {
    public static void main1(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String command = sc.hasNext() ? sc.next() : "";
        boolean[][] passVertical = new boolean[N][N];
        boolean[][] passHorizontal = new boolean[N][N];
        int curR = 0;
        int curC = 0;
        for(int i = 0; i < command.length(); i++){
            char cmd = command.charAt(i);
            if(cmd == 'D'){
                if(curR == N - 1)continue;
                passVertical[curR][curC] = true;
                passVertical[curR + 1][curC] = true;
                curR++;
            }else if(cmd == 'U'){
                if(curR == 0)continue;
                passVertical[curR][curC] = true;
                passVertical[curR - 1][curC] = true;
                curR--;
            }else if(cmd == 'L'){
                if(curC == 0)continue;
                passHorizontal[curR][curC] = true;
                passHorizontal[curR][curC - 1] = true;
                curC--;
            }else{
                if(curC == N - 1)continue;
                passHorizontal[curR][curC] = true;
                passHorizontal[curR][curC + 1] = true;
                curC++;
            }

        }

        for(int i = 0 ; i < N; i++){
            String ans = "";
            for(int j = 0; j < N; j++){
                if(passVertical[i][j] && passHorizontal[i][j]) ans += "+";
                else if(passVertical[i][j]) ans += "|";
                else if(passHorizontal[i][j]) ans += "-";
                else ans += ".";
            }
            System.out.println(ans);
        }

    }
}

