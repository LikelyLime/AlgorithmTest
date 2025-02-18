package algorithm;

import java.util.*;

public class algo21 {
    public static void main1(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[][] memories = new String[N][2];

//        for(int i = 0; i < N; i++){
//
//            memories[i][0] = sc.next();
//            memories[i][1] = sc.next();
//
//        }
//
//
//        Arrays.sort(memories, new Comparator<String[]>() {
//            @Override
//            public int compare(String[] o1, String[] o2) {
//                return o2[0].compareTo(o1[0]);
//            }
//        });
//
//        for(int i = 0; i < N - 1; i++){
//            if(memories[i][1].equals("enter") && !memories[i][0].equals(memories[i + 1][0])){
//                System.out.println(memories[i][0]);
//            }
//        }
//        if(memories[N - 1][1].equals("enter")){
//            System.out.println(memories[N - 1][0]);
//        }
        Set<String> entered = new TreeSet<>();
        for(int i = 0; i < N; i++){
            String name = sc.next();
            String status = sc.next();
            if(status.equals("enter")){
                entered.add(name);
            }else{
                entered.remove(name);
            }
        }
        String[] ans = entered.toArray(new String[entered.size()]);
        for(int i = ans.length - 1; i >= 0; i--){
            System.out.println(ans[i]);
        }
    }
}
