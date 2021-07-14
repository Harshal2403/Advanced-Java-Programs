package com.wrapper;

public class wrapperTest1 {
    public static void main(String[] args) {
        int x=25,i=25;
        Integer y=new Integer(35);
        Integer j=new Integer(35);

        y=x;//autoboxing
        System.out.println("Integer y = "+y);

        i=j;//unboxing
        System.out.println("int i = "+i);
    }
}
