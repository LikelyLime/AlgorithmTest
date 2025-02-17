package algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class algo20 {
    static class Pepole{
        int age;
        String name;
        public Pepole(int age, String name){
            this.age = age;
            this.name = name;
        }
    }
    //2번째 방법
    static class Member implements Comparable<Member>{
        int age;
        String name;
        int idx;
        Member(int age, String name, int idx){
            this.age = age;
            this.name = name;
            this.idx = idx;
        }

        @Override
        public int compareTo(Member o) {
            if(age != o.age){
                return  age - o.age;
            }
            return idx - o.idx;
        }
    }
    public static void main1(String[] args){

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Pepole[] members = new Pepole[N];
        for(int i = 0; i < N; i++){
            Pepole member = new Pepole(sc.nextInt(), sc.next());
            members[i] = member;
        }

        Arrays.sort(members, new Comparator<Pepole>() {
            @Override
            public int compare(Pepole o1, Pepole o2) {
                if(o1.age == o2.age){
                    return 0;
                }
                return o1.age - o2.age;
            }
        });

        for(int i = 0; i < N; i++){
            System.out.println(members[i].age + " " + members[i].name);
        }

    }
}

