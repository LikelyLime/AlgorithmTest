package algorithm;

import java.io.IOException;
import java.util.Scanner;

public class Algo44 {
    static int baseToIndex(char alph) {
        if (alph == 'A') return 0;
        else if (alph == 'C') return 1;
        else if (alph == 'G') return 2;
        else if (alph == 'T') return 3;
        return -1;
    }
    public static void mai1n(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int P = sc.nextInt();
        char[] sequence = sc.next().toCharArray();
        int[] minimumCount = new int[4];
        for(int i = 0; i < 4; i++){
            minimumCount[i] = sc.nextInt();
        }
        int[] count = new int[4];
        for(int i = 0; i < P - 1; i++){
            count[baseToIndex(sequence[i])]++;
        }
        int ans = 0;
        for(int i = P - 1; i < S; i++){
            //이번 윈도우 끝값을 추가
            count[baseToIndex(sequence[i])]++;
            if(isValid(count, minimumCount)){
                ans++;
            }
            //이번 윈도우의 첫값 삭제
            count[baseToIndex(sequence[i - P + 1])]--;
        }
        System.out.println(ans);
    }

    private static boolean isValid(int[] count, int[] minimumCount) {
        for(int i = 0; i < count.length; i++){
            if(count[i] < minimumCount[i]){
                return false;
            }
        }
        return true;
    }
}
