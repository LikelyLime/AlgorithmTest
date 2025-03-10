package algorithm;

import java.util.*;
import java.io.*;
import java.util.Arrays.*;
public class algo39 {
    public static void m1ain(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] useAmount = new int[N];

        for (int i = 0; i < N; i++) {
            useAmount[i] = sc.nextInt();
        }
        int l = 1, r = N * 10000, ans = -1;
        while(l <= r){
            int m = (l + r) / 2;
            if(isPosible(useAmount, m, M)){
                r = m - 1;
                ans = m;
            }else{
                l = m + 1;
            }
        }
        System.out.println(ans);

    }

    private static boolean isPosible(int[] useAmounts, int drowAmount, int maxDrowAmount) {
        int drowCount = 1;
        int currentDrowAmount = drowAmount;

        for(int useAmount : useAmounts){
            if(useAmount > drowAmount){ return  false; }
            if(useAmount > currentDrowAmount){
                if(drowCount == maxDrowAmount){
                    return false;
                }
                drowCount++;
                currentDrowAmount = drowAmount;
            }
            currentDrowAmount -= useAmount;
        }
        return true;
    }


}

