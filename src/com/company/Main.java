package com.company;

public class Main {

    public static void main(String[] args) {


        long main = new Main().sumLong((long) (2 * Math.pow(10,18)), (long) (2 * Math.pow(10,18)));
        System.out.println(main);



    }
    public int sum(int a, int b) {
        return a + b;
    }

    public long sumLong(long a, long b) {
        return (long) a + b;
    }
}
