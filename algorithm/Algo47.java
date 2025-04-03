package algorithm;


import java.util.*;
import java.io.*;
import java.util.Arrays.*;
public class Algo47 {

    public static void m2ain(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-- > 0){
            char[] s = sc.next().toCharArray();
            int l = 0;
            int r = s.length - 1;
            int ans = 0;
            while(l <= r){
                if(s[l] != s[r]){
                    if(isPalindrome(s, l, r - 1) || isPalindrome(s, l + 1, r)){
                        ans = 1;
                    }else{
                        ans = 2;
                    }
                    break;
                }
                l++;
                r--;
            }
            System.out.println(ans);
        }


    }
    static boolean isPalindrome(char[] s, int l, int r){
        while(l <= r){
            if(s[l] != s[r]){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
