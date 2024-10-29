package algorithm;

import java.util.Scanner;

public class algo3 {
    public static int[] getAlpa(String str){
        int[] count = new int[26];
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if ('A' <= ch && 'Z' >= ch)
                count[ch - 'A']++;
            else count[ch - 'a']++;
        }
        return count;
    }
    public static void algo(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        int[] count = getAlpa(str1);
        int maxCount = -1;
        char maxAlpha = '?';
        for(int i = 0; i < 26; i++){
            if (count[i] > maxCount){
                maxCount = count[i];
                maxAlpha = (char)('A' + i);
            }else if(count[i] == maxCount){
                maxAlpha = '?';
            }
        }
        System.out.println(maxAlpha);
    }
}
