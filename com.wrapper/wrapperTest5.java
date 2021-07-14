package com.wrapper;

public class wrapperTest5 {
    public static void main(String[] args) {
        int x =35;
        Integer y =35;
        Integer z =new Integer(35);

        boolean b1= (x==y);
        boolean b2= (z==x);
        boolean b3= (y==z);
        //boolean b4= x.equals(y);
        boolean b5= y.equals(x);
        //boolean b6= x.equals(z);
        boolean b7= z.equals(x);
        boolean b8= y.equals(z);
        boolean b9= z.equals(y);

        System.out.println("b1 = "+b1);
        System.out.println("b2 = "+b2);
        System.out.println("b3 = "+b3);
        //System.out.println("b4 = "+b4);
        System.out.println("b5 = "+b5);
        //System.out.println("b6 = "+b6);
        System.out.println("b7 = "+b7);
        System.out.println("b8 = "+b8);
        System.out.println("b9 = "+b9);
    }
}
