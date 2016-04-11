/*
 * Copyright (c) 2016. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package test;

/**
 * Created by lusai on 4/11/16.
 *
 * algorithms in java
 *
 * program 3.1
 */
public class LogTable {
    static int lg(int N) {
        int i=0;
        while (N > 0) {
            i++;
            N /= 2;
        }
        return i;
    }

    public static void main(String[] args) {
        for (int N = 1000; N <= 1000000000;N*=10)
            Out.print(lg(N)+" "+ N);
    }

}
