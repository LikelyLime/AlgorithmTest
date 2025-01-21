package algorithm;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;

public class algo11 {
    public static void main1(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 1. 몇개의 테스트인지 알고 for문을 돌린다.
        for(int i = 0; i < n; i++){
            int solution = 0;
            // 2. 문제보다 작은 삼각수를 구한다.
            int num = sc.nextInt();

            int sum = 0;
            int[] ary = new int[45];
            for(int j = 1; j < 45; j++){
                sum += j;
                ary[j - 1] = sum;
                if(sum > num){
                    break;
                }
            }

            // 3. 세개의 삼각수를 더해서 답이 나오면 1 / 아니면 0
            outer:
            for(int j = 0; j < ary.length; j++){
                for(int h = 0; h < ary.length; h ++){
                    for(int s = 0; s < ary.length; s++){
                        if(num == ary[j] + ary[h] + ary[s]
                                && ary[j] != 0
                                && ary[h] != 0
                                && ary[s] != 0){
                            solution = 1;
                            break outer;

                        }
                    }
                }
            }
            System.out.println(solution);
            solution = 0;
        }




    }
}

