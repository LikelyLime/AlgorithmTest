package algorithm;

import java.util.Scanner;

public class algo6 {
    public static void test(String[] args){

        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int p = sc.nextInt();
        int q = sc.nextInt();
        int time = sc.nextInt();
        int currentX = (p + time) % (2 * w);
        int currentY = (q + time) % (2 * h);
        if (currentX > w){
            currentX = 2 * w - currentX;
        }
        if(currentY > h){
            currentY = 2 * h - currentY;
        }

        System.out.println(currentX + " " + currentY);

    }
}
