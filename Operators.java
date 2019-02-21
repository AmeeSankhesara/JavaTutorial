package com.Amee;

public class Operators {

    public static void main(String[] args) {
	    int result = 1 + 2;
        System.out.println("1+2 = " + result);

        int Previousresult = result;
        result = result - 1;
        System.out.println(Previousresult + " - 1 = " + result);

        Previousresult = result;

        result = result * 10;
        System.out.println(Previousresult + " * 10 = " + result);

        Previousresult = result;

        result = result / 5 ;
        System.out.println(Previousresult + " / 5 = " + result);

        Previousresult = result;

        result = result % 3 ;
        System.out.println(Previousresult + " % 3 = " + result);

        Previousresult = result;
        result = result + 1;
        System.out.println("result is now = " + result);

        result++;
        System.out.println("result is now = " + result);

        result--;
        System.out.println("result is now = " + result);

        result += 2;
        System.out.println("result is now = " + result);

        result *= 10;
        System.out.println("result is now = " + result);

        result -= 10;
        System.out.println("result is now = " + result);

        result /= 10;
        System.out.println("result is now = " + result);

        boolean isTrue = false;
        if (isTrue == false)
            System.out.println("It is not true");

        int topscore = 90;
        if (topscore < 100)
            System.out.println("you got high score!!");

        int secondtopscore = 80;
        if (topscore > secondtopscore && topscore < 100)
            System.out.println("top score greater than second top score and less than 100");

        if ((topscore>90)||(secondtopscore<=90))
            System.out.println("one of these tests is true");

        int newvalue = 50;
        if (newvalue ==50)
            System.out.println("This is true");

        boolean iscar = false;
        if(iscar)
            System.out.println("This is not suppose to happen");

        iscar = true;
        boolean wascar = iscar ? true : false;
        if(wascar)
            System.out.println("was car is true");

        double a = 20d;
        double b = 80d;
        double c = (a+b)*25;

        double d = c%40;
        System.out.println("remainder = " + d);

        if (d<=20)
            System.out.println("Total was over the limit");

    }
}
