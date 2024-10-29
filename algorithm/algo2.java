package algorithm;

import java.util.Scanner;

public class algo2 {
    //1919 애너그램
    public void algo(){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        int result = 0;
        int[] countA = new int[26];
        int[] countB = new int[26];
        for(int i = 0; i < str1.length(); i++){
            countA[str1.charAt(i) - 'a']++;
        }
        for(int i = 0; i < str2.length(); i++){
            countB[str2.charAt(i) - 'a']++;
        }

        for(int i = 0 ; i < 26; i++)
            result = Math.abs(countA[i] - countB[i]);

//            if(countA[i] > countB[i]){
//                result += countA[i] - countB[i];
//            }else if(countA[i] < countB[i]){
//                result += countB[i] - countA[i];
//            }
        System.out.println(result);
    }
}
