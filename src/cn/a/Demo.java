package cn.a;

import java.util.*;

/**
 * Created by lusai on 12/11/15.
 */
public class Demo {
    public static void main(String[] args) {
        List<String> features;
        features = Arrays.asList("Lambda", "Default Method", "Stream API", "Date and Time API");

        System.out.println(features);
        System.out.println("=========================");
        for (String feature : features) {
            System.out.println(feature);
        }
        System.out.println("=========================");
        features.forEach(n -> System.out.println(n));

        System.out.println("=========================");
        features.forEach(System.out::println);
    }
}
