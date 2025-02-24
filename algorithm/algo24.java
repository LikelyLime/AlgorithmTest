package algorithm;

import java.io.IOException;
import java.util.*;

public class algo24 {
    public static void main1(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int least = sc.nextInt();
        Integer[] nums = new Integer[N];
        Map<Integer,Integer> sortedIndex = new HashMap<>();
        Map<Integer,Integer> countMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
            if (!sortedIndex.containsKey(nums[i])) {
                sortedIndex.put(nums[i], i);
                countMap.put(nums[i], 1);
            }else{
                countMap.put(nums[i], countMap.get(nums[i])+1);
            }
        }

        Arrays.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(countMap.get(o1) == countMap.get(o2)){
                    return sortedIndex.get(o1).compareTo(sortedIndex.get(o2));
                }
                return countMap.get(o2) - countMap.get(o1);
            }
        });

        for (int i = 0; i < N; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}
