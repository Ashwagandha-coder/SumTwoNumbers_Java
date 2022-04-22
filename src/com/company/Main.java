package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {

        Integer a = 2_000_000_000;
        Integer b = 2_000_000_000;

        Main main = new Main();

        System.out.println(main.sumOptimal(a,b));
       // System.out.println(Math.pow(2,31));



    }
    public int sum(int a, int b) throws OutOfIntegerException {

        int c = Integer.MAX_VALUE - a;
        int d = b - c;

        if (b >= c)
            throw new OutOfIntegerException();
        else
            return a + b;

    }

    public long sumLong(long a, long b) {
        return (long) a + b;
    }

    public Number sumOptimal(int a, int b) {

        try {
            return sum(a,b);
        }
        catch (OutOfIntegerException exception) {
            return sumLong(a,b);
        }

    }
}

class OutOfIntegerException extends Exception {

    @Override
    public String getMessage() {
        return "out of type int";
    }
}
