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
 * <p>
 * program 3.3
 * <p>
 * statistics of a sequence of random numbers
 */

public class PrintStats {
    public static void main(String[] args) {
        //int N = Integer.parseInt(args[0]);
        int N = 100;
        double m = 0.0, s = 0.0;
        for (int i = 0; i < N; i++) {
            int x = (int) (Math.random() * 10000);
            double d = (double) x;
            m += d / N;
            s += (d * d) / N;
        }
        s = Math.sqrt(s - m * m);
        Out.println("   Avg.: " + m);
        Out.println("Std. dev.: " + s);
    }
}