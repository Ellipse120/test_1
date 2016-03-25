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
public class QuickF {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int id[] = new int[N];

        for (int i = 0; i < N; i++) {
            id[i] = i ;
        }

        for(In.init(); !In.empty();){
            int p = In.getInt(), q = In.getInt();
            int t = id[p];
            if(t==id[q]) continue;
            for (int i = 0; i < N; i++) {
                if(id[i] == t) id[i] = id[q];
            }
            Out.println(" " + p + " " + q);
        }


    }
}
