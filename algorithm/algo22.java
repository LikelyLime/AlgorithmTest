package algorithm;

import java.util.*;
import java.io.*;

public class algo22 {
    public static void main1(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
//        String[] ary = new String[N];
//        for(int i = 0; i < N; i++){
//            ary[i] = sc.next();
//        }
//        Arrays.sort(ary);
//
//        String word = ary[0];
//        int maxNum = 1;
//        int curNum = 1;
//        for(int i = 1; i < N; i++){
//            if(!ary[i].equals(ary[ i - 1 ])){
//                curNum = 0;
//            }
//            curNum++;
//            if(curNum > maxNum || (curNum == maxNum && ary[i].compareTo(word) < 0)){
//                word = ary[i];
//                maxNum = curNum;
//            }
//        }
//        System.out.println(word);
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < N; i++){
            String title = sc.next();
            map.put(title, map.getOrDefault(title, 0) + 1);
        }
        String maxTitle = "";
        int maxCount = 0;
        for(Map.Entry<String, Integer> title : map.entrySet()){
            String titleName = title.getKey();
            int count = title.getValue();
            if(count > maxCount || (count == maxCount && titleName.compareTo(maxTitle) < 0)){
                maxTitle = titleName;
                maxCount = count;
            }
        }
        System.out.println(maxTitle);
    }
}
