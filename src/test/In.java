/*
 * Copyright (c) 2016. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package test;

import java.io.IOException;

/**
 * Created by lusai on 3/25/16.
 */
public class In {

    private static int c;
    private static boolean balnk(){
        return Character.isWhitespace((char) c);
    }

    private static void readC(){
        try {
            c = System.in.read();
        }catch (IOException e){
            c = -1;
        }
    }

    public static void init() {
        readC();
    }

    public static boolean empty(){
        return c == -1;
    }

    public static String getString(){
        if(empty()) return null;
        String s = "";
        do {
            s += (char)c ;
            readC();
        }while (!(empty()|balnk()));
        while (!(empty() && balnk())) readC();
        return s;
    }

    public static int getInt(){
        return Integer.parseInt(getString());
    }

    public static double getDouble(){
        return Double.parseDouble(getString());
    }

}
