package com.Amee;

public class Strings {

    public static void main(String[] args) {
	// Primitive data types
        // Int
        // short
        // Byte
        // Double
        // Float
        // Long
        // Char
        // Boolean
     // String data type is actually string class
        String mystring = "This is a string";
        System.out.println("mystring = " + mystring);
        mystring = mystring + " , and more";
        System.out.println("mystring = " + mystring);
        mystring = mystring + "\u00A9 2019 ";
        System.out.println("mystring = " + mystring);

        String mynumberstring = "23";
        mynumberstring = mynumberstring + "67.98";
        System.out.println("mystring = "+ mynumberstring);

        String LastString = "10";
        int myInt = 15;
        LastString = LastString + myInt;
        System.out.println("myLastString = " + LastString);

    }
}
