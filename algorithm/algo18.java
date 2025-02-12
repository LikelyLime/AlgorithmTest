package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class algo18 {
    public static void main1(String[] args){

        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();
        int copyN = N;
        if(N != 0){
            char[] stap = new char[N];
            int[][] allPersonScore = new int[N][13];
            int[] chips = new int[N];
            int index = 0;
            while(copyN-- > 0){
                char name = sc.next().charAt(0);
                int num = sc.nextInt();
                if(num < X * 0.05){
                    continue;
                }
                int[] person = new int[14];
                stap[index] = name;
                for(int i = 1; i < 15; i++){
                    person[i - 1] = num / i;
                }
                allPersonScore[index] = person;
                index++;
            }

            for(int i = 0; i < 14; i++){

                int max = allPersonScore[0][0];
                int maxIndex = 0;
                for(int j = 0; j < N; j++){
                    for(int k = 0; k < 13; k++){
                        if(max < allPersonScore[j][k]){
                            max = allPersonScore[j][k];
                            maxIndex = j;
                        }
                    }
                }
                chips[maxIndex] ++;
                for(int j = 0; j < N; j++){
                    for(int k = 0; k < 13; k++){
                        if(max == allPersonScore[j][k]){
                            allPersonScore[j][k] = 0;
                            continue;
                        }
                    }
                }
            }
            int chipIndex = 0;
            for(int i = 0; i < N; i++){
                if(stap[i] != 0) chipIndex++;
            }
            String[] ans = new String[chipIndex];
            int lastIndex = 0;
            for(int i = 0; i< N; i++){
                if(stap[i] == 0){
                    continue;
                }
                ans[lastIndex] = String.valueOf(stap[i]) + " " + String.valueOf(chips[i]);
                lastIndex++;
            }
            Arrays.sort(ans);
            for(int i = 0; i< chipIndex; i++){
                System.out.println(ans[i]);
            }
        }
    }
}
