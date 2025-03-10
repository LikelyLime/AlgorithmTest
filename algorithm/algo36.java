package algorithm;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class algo36 {
    public static void main1(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = sc.nextInt();
        }
        Arrays.sort(cards);
        int M = sc.nextInt();
        while (M-- > 0) {
            int x = sc.nextInt();
            int lowerBoundIndex = findLowerBoundIndex(cards, x);
            int upperBoundIndex = findUpperBoundIndex(cards, x);
            System.out.print(upperBoundIndex - lowerBoundIndex + " ");
        }

    }

    private static int findUpperBoundIndex(int[] cards, int x) {
        int upperBoundIndex = cards.length;
        int l = 0, r = cards.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (cards[m] <= x) {
                l = m + 1;
            }else{
                r = m - 1;
                upperBoundIndex = m;

            }
        }
        return upperBoundIndex;
    }
    private static int findLowerBoundIndex(int[] cards, int x) {
        int lowerBoundIndex = cards.length;
        int l = 0, r = cards.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            if (cards[m] < x) {
                l = m + 1;
            }else{
                r = m - 1;
                lowerBoundIndex = m;

            }
        }
        return lowerBoundIndex;
    }
}
