package com.Priyanshu;

public class Do_While {
    public static void main(String[] args) {

        int n = -1, fn = 100, count = 0;
        while (n < fn) {
            n++;
            if (!isEven(n)) {
                continue;
            }
            count++;
            System.out.println("Even Number " + n);
            if (count >= 5) {
                break;
            }

        }
        System.out.println("no of evevn numbers found " + count);

    }

    public static boolean isEven(int no) {
        if ((no % 2) == 0) {
            return true;
        } else
            return false;
    }
}
