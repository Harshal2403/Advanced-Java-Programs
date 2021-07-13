package com.wrapper;

public class unBox {
    public static void main(String[] args) {

        Integer i = new Integer(5);

        int a = i.intValue();

        System.out.println("Unboxing:");
        System.out.println("Integer i = "+i);
        System.out.println("int     a = "+a);
    }
}
