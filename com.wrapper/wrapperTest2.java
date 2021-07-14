package com.wrapper;

public class wrapperTest2 {
    public static void main(String[] args) {
        int x=35;
        Integer y = new Integer(35);

        if (y.equals(x)) {
            System.out.println("Hi!!");
        }
        else {
            System.out.println("Hello");
        }
    }
}
