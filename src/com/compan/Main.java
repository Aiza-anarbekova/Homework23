package com.compan;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        method(new int[10]);
        System.out.println();
        method(new ArrayList<>());
        System.out.println();
        method(new ArrayList<>());
    }
    public static void method(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(0, 2);
            Arrays.sort(array);
            System.out.print(array[i] + " ");
        }
    }

    public static void method(ArrayList<Integer> arrayList) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(0, 2));
            Collections.sort(arrayList);
        }
        System.out.print(arrayList + " ");
    }
    public static void method(LinkedList<Integer> linkedList) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            linkedList.add(random.nextInt(0, 2));
            Collections.sort(linkedList);
        }
        System.out.println(linkedList+" ");
    }
}