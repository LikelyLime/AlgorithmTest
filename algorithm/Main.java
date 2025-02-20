package algorithm;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] ary = new String[N];
        for(int i = 0; i < N; i++){
            ary[i] = sc.next();
        }
        Arrays.sort(ary);

        String word = ary[0];
        int maxNum = 1;
        int curNum = 1;
        for(int i = 1; i < N; i++){
            if(!ary[i].equals(ary[ i - 1 ])){
                curNum = 0;
            }
            curNum++;
            if(curNum > maxNum || (curNum == maxNum && ary[i].compareTo(word) < 0)){
                word = ary[i];
                maxNum = curNum;
            }
        }
        System.out.println(word);
    }
}

