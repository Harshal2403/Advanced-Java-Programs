package com.wrapper;

public class wrapperTest4 {
    public static void main(String[] args) {
        Integer x=35;
        Integer y=35;
        Integer z=new Integer(35);

        boolean bool1= x.equals(y);
        boolean bool2= x.equals(z);
        boolean bool3= x==y;
        boolean bool4= x==z;

        System.out.println("x.equals(y) = "+bool1);
        System.out.println("x.equals(z) = "+bool2);
        System.out.println("x==y = "+bool3);
        System.out.println("x==z = "+bool4);
    }
}
