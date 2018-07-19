package com.hand;

public class Exam2 {
    public double  test(int i) {
        double x=0;
        if (i <= 1500) {
            x = i * 0.03;
        }
        if (i >1500 && i <= 4500) {
            x = i * 0.1;

        }
        if (i > 4500 && i <= 9000) {
            x = i * 0.2;
        }
        if (i > 9000 && i <= 35000) {
            x = i * 0.25;
        }
        if (i > 35000 && i <= 55000) {
            x = i * 0.3;
        }
        if (i > 55000 && i <= 80000) {
            x = i * 0.35;
        }
        if (i > 80000) {
            x = i * 0.45;
        }
        return x;
    }

    public static void main(String[] args) {
        Exam2 userA=new Exam2();
        double u1=userA.test(5000-3500);
        Exam2 userB=new Exam2();
        double u2=userB.test(10000-3500);
        Exam2 userC=new Exam2();
        double u3=userC.test(15000-3500);
        Exam2 userD=new Exam2();
        double u4=userD.test(60000-3500);
        System.out.printf("各自需要缴纳的税费是：userA："+u1+"元,userB:"+u2+"元,userC:"+u3+"元,userD:"+u4+"元");

    }
}
