/*
 * Copyright (c) 2016. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package test;

/**
 * Created by lusai on 3/25/16.
 */
public class HashTest {

    static int hash(String s, int M) {
        int h = 0 , a = 127;
        for (int i = 0; i < s.length(); i++) {
            h = (a*h + s.charAt(i))%M;
        }
        return h;
    }

    public static void main(String[] args) {
        hash("lusai",128);
    }

}
