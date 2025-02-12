package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class algo17 {
    public static void main2(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        char[] wheel = new char[N];
        Arrays.fill(wheel, '?'); //배열에 특정문자로 채우기

        int currentIndex = 0;
        while(K-- > 0){
            int step = sc.nextInt();
            char nextAlpa = sc.next().charAt(0);
            int nextIndex = ((currentIndex - step) % N + N) % N;
            if(wheel[nextIndex] == '?'){
                wheel[nextIndex] = nextAlpa;
            }else if(wheel[nextIndex] != nextAlpa){
                System.out.println("!");
                return;
            }
            currentIndex = nextIndex;
        }

        boolean[] used = new boolean[26];
        for(int i = 0; i < N; i++){
            if(wheel[i] == '?'){continue;}
            if(used[wheel[i] - 'A']){
                System.out.println("!");
                return;
            }
            used[wheel[i] - 'A'] = true;
        }

        for(int i = 0; i < N; i++){
            System.out.print(wheel[(currentIndex + i) % N]);
        }
    }
}
