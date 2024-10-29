package algorithm;

import java.util.Scanner;

public class algo1 {
    //2744 대소문자 바꾸기
    public void solution(){
        Scanner sc = new Scanner(System.in);
        char[] charArray = sc.next().toCharArray();
        String result = "";
        for(char s : charArray){
            String test = "";
            if( (int)s < 97 ){
                //(char)('a' - s - 'A')
                test = String.valueOf(s).toLowerCase();
            }else{
                //(char)('A' - s - 'a')
                test = String.valueOf(s).toUpperCase();
            }
            result += test;
            test = "";
        }

        System.out.println(result);
    }
}
