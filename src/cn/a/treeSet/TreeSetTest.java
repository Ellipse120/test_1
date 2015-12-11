/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package cn.a.treeSet;
import java.util.*;

/**
 * Created by lusai on 12/11/15.
 */
public class TreeSetTest {
    public static void main(String[] args) {
        SortedSet<Item> parts = new TreeSet<>();
        parts.add(new Item("Toast",1234));
        parts.add(new Item("Widget", 4562));
        parts.add(new Item("Modem", 9912));
        System.out.println(parts);

        SortedSet<Item> sortedByDescription = new TreeSet<>(new Comparator<Item>() {
            @Override
            public int compare(Item a, Item b) {
                String descrA = a.getDescription();
                String descrB = b.getDescription();

                return descrA.compareTo(descrB);
            }
        });

        sortedByDescription.addAll(parts);
        System.out.println(sortedByDescription);

        System.out.println("=========Lambda Exp=========");
        //use Lambda exp...
        SortedSet<Item> sortByDescriptionLambda = new TreeSet<>( (a,b)->{
            return a.compareTo(b);
        });

        sortByDescriptionLambda.addAll(parts);
        System.out.println(sortByDescriptionLambda);
    }


}
