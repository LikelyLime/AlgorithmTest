package algorithm;

import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class algo28 {
    public static void main1(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] arr = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    int c1Sum = 0, c2Sum = 0;

                    for (char c : o1.toCharArray()) {
                        if (Character.isDigit(c)) {
                            c1Sum += c - '0';
                        }
                    }
                    for (char c : o2.toCharArray()) {
                        if (Character.isDigit(c)) {
                            c2Sum += c - '0';
                        }
                    }
                    if (c1Sum != c2Sum) {
                        return c1Sum - c2Sum;
                    }else{
                        return o1.compareTo(o2);
                    }
                }
                return o1.length() - o2.length();
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.println(arr[i]);
        }
    }
}
