package com.AmeeShah;

public class FloatAndDouble {

    public static void main(String[] args) {
	// write your code here
        //width of int = 32 bit(4 bytes)
        int myIntValue = 5/3;
        //7 numbers after decimal points
        //width of float = 32 bit(4 bytes)
        float myFloatValue = 5f / 3f;
        //16 numbers after decimal points
        //width of double = 64 bit(8 bytes)
        double myDoubleValue = 5d / 3d;

        double numofpounds = 200d;
        double poundtokg = numofpounds*0.45359237;
        System.out.println("kilograms = " + poundtokg);

        System.out.println("myIntValue = "+ myIntValue);
        System.out.println("myFloatValue = "+ myFloatValue);
        System.out.println("myDoubleValue = "+ myDoubleValue);
    }
}
