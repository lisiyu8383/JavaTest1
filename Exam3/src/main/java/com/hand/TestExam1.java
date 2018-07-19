package com.hand;

import java.util.*;

public class TestExam1 implements Exam3 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 50; i++) {
            int num = random.nextInt(100);
            list.add(num);
        }
        System.out.print("List集合：");
        for (int i=0;i<list.size();i++) {
            System.out.print(list.get(i)+",");
        }
        for (int i=0;i<list.size();i++){

            Map<Integer,Integer> map=new HashMap<Integer,Integer>();
            if(list.get(i)/10==0){
                int k=list.get(i)/10;
            }
        }
    }
}
