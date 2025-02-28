package algorithm;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class algo29 {
    public static void main1(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int arrN = sc.nextInt();
        int questN = sc.nextInt();
        int[][] arr = new int[arrN + 1][arrN + 1];
        for (int i = 1; i <= arrN; i++) {
            for (int j = 1; j <= arrN; j++) {
                arr[i][j] = sc.nextInt();
            }

        }
        //누적합 배열 생성
        int [][] acc = new int[arrN + 1][arrN + 1];
        for (int i = 1; i <= arrN; i++) {
            for (int j = 1; j <= arrN; j++) {
                acc[i][j] = acc[i - 1][j] + acc[i][j - 1] - acc[i - 1][j - 1] + arr[i][j];

            }
        }



        while(questN-- > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            bw.write(acc[x2][y2] - acc[x1 - 1][y2] - acc[x2][y1 - 1] + acc[x1 - 1][y1 - 1] + "\n");
        }
        bw.flush();
    }
}
