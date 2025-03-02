package algorithm;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class algo35 {
    public static void main1(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ansAbs = 2000000001;
        int ans1 = -1;
        int ans2 = -1;
        //1. 첫번째 용액에 대해 최적쌍이 되는 두 번째 용액을 찾는다.
        for (int i = 0; i < N -1; i++){
            int pairValue = findOptimalPairValue(arr, i + 1, N - 1, arr[i]);
            int abs = Math.abs(arr[i] + pairValue);
            if(abs < ansAbs){
                ansAbs = abs;
                ans1 = arr[i];
                ans2 = pairValue;
            }
        }
        //2. 두 용액의 합이 0과 가장 가까운 쌍을 찾아 출력
        System.out.println(ans1 + " " + ans2);


    }

    private static int findOptimalPairValue(int[] arr, int formIndex, int toIndex, int value) {
        int optimalPairValue = 0;
        int optimalPairAbs = 2000000001;
        int l = formIndex, r = toIndex;
        while (l <= r) {
            int m = (l + r) / 2;
            int sum = value + arr[m];
            int sumAbs = Math.abs(sum);
            if (sumAbs < optimalPairAbs) {
                optimalPairAbs = sumAbs;
                optimalPairValue = arr[m];
            }
            if(sum < 0){
                l = m + 1;
            }else if(sum > 0){
                r = m - 1;
            }else{
                return arr[m];
            }
        }
        return optimalPairValue;
    }
}
