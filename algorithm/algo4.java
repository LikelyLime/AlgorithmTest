package algorithm;

import java.util.Scanner;

public class algo4 {
    public static void algo(String[] args) {
        //1543 문서검색
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int startIndex = 0;
        int count = 0;
        while (true){
            int findIndex = str1.indexOf(str2, startIndex);
            if(findIndex < 0){
                break;
            }
            startIndex = findIndex + str2.length();
            count++;
        }
        System.out.println(count);
    }

    public static void algo2(){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String replaced = str1.replace(str2, "");
        int length = str1.length() - replaced.length();
        int count = length / str2.length();
        System.out.println(count);
    }

}
