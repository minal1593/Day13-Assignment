package com.Bridgelabz;


public class Maxinteger {
    public static <E extends Comparable<E>> E max(E[] list) {

        E comp1 = list[0];

        for (E e : list) {
            if (comp1.compareTo(e) < 0) {
                comp1 = e;
            }
        }
        return comp1;
    }

    public static void main (String[] args) {

        Integer[] ints = {5, 14, 4};


        System.out.println(max(ints));
    }
}