package algorithm;

import java.util.*;
import java.io.*;
import java.util.Arrays.*;
class Meetting{
    int start;
    int end;
    Meetting(int start, int end){
        this.start = start;
        this.end = end;
    }
}
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Meetting[] meetings = new Meetting[N];
        for (int i = 0; i < N; i++) {
            meetings[i] = new Meetting(sc.nextInt(), sc.nextInt());
        }

        Arrays.sort(meetings, new Comparator<Meetting>() {
            @Override
            public int compare(Meetting o1, Meetting o2) {
                if (o1.end == o2.end) {
                    return o1.start - o2.start;
                }
                return o1.end - o2.end;
            }
        });

        int cnt = 0;
        int ended = 0;
        for(Meetting meetting : meetings) {
            if(ended <= meetting.start) {
                cnt++;
                ended = meetting.end;
            }
        }
        System.out.println(cnt);
    }
}

