package algorithm;

import java.util.Scanner;

public class algo7 {
    public static void main2(String[] args){
        //O(NM)
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String[] arr = new String[m];
        int solution = 0;
        int solution2 = 0;
        for(int i = 0; i < n; i++){
            String line = sc.next();
            if(line.contains("X")){

                String[] arr2 = line.split("");
                for(int j = 0; j < m; j ++){
                    if(arr2[j].equals("X")){
                        arr[j] = "X";
                    }
                }
            }else{
                solution += 1;
            }

        }
        for(int i = 0; i< arr.length; i ++){
            if(arr[i] == null){
                solution2 += 1;
            }
        }

        System.out.println(Math.max(solution, solution2));
    }
}
