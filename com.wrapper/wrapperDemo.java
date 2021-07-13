package com.wrapper;

public class wrapperDemo {
    public static void main(String[] args) {
        boolean boolValue = true;
        char charValue = 'H';
        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 30;
        long longValue = 40;
        float floatValue = 50.0f;
        double doubleValue = 60.0d;

        System.out.println("boolean : "+boolValue);
        System.out.println("char : "+charValue);
        System.out.println("byte : "+byteValue);
        System.out.println("short : "+shortValue);
        System.out.println("int : "+intValue);
        System.out.println("long : "+longValue);
        System.out.println("float : "+floatValue);
        System.out.println("double : "+doubleValue);

        System.out.println("\nAutoboxing");

        Boolean boolObj = boolValue;
        Character charObj = charValue;
        Byte byteObj = byteValue;
        Short shortObj = shortValue;
        Integer intObj = intValue;
        Long longObj = longValue;
        Float floatObj = floatValue;
        Double doubleObj = doubleValue;

        System.out.println("Boolean object: "+boolObj);
        System.out.println("Character object: "+charObj);
        System.out.println("Byte object: "+byteObj);
        System.out.println("Short object: "+shortObj);
        System.out.println("Integer object: "+intObj);
        System.out.println("Long object: "+longObj);
        System.out.println("Float object: "+floatObj);
        System.out.println("Double object: "+doubleObj);
    }
}
