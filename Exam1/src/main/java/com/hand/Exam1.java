package com.hand;

import java.util.ArrayList;

public class Exam1 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i < 201; i++) {
            int j = 2;
            for (; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j>=i) {
                count++;
            }
        }
        System.out.print("101-200总共有" + count + "个素数，分别是：");
        int a[]=new int [count];
        for (int i = 101; i < 201; i++) {
            int j = 2;
            for (; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j==i) {
                 System.out.print(i+",");
            }
        }
        }
    }
