package algorithm;

import java.util.Scanner;

public class algo5 {
    //13223 소금 폭탄
    public static void algo(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();//current
        String str2 = sc.nextLine();//drop
        String[] time1 = str1.split(":");
        String[] time2 = str2.split(":");
        int currentHour = Integer.parseInt(time1[0]);
        int currentMinute = Integer.parseInt(time1[1]);
        int currentSecond = Integer.parseInt(time1[2]);
        int currentSecondAmount = currentHour * 3600 + currentMinute * 60 + currentSecond;
        int dropHour = Integer.parseInt(time2[0]);
        int dropMinute = Integer.parseInt(time2[1]);
        int dropSecond = Integer.parseInt(time2[2]);
        int dropSecondAmount = dropHour * 3600 + dropMinute * 60 + dropSecond;

        int needSecondAmount = dropSecondAmount - currentSecondAmount;
        if(needSecondAmount <= 0){
            needSecondAmount += 24 * 3600;
        }
        int needHour = needSecondAmount / 3600;
        int needMinute = (needSecondAmount % 3600) / 60;
        int needSecond = needSecondAmount % 60;
        System.out.printf("%02d:%02d:%02d", needHour, needMinute, needSecond);
    }
}
