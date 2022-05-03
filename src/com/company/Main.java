package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(contains(2, 84, 32, 98, 2, 27));
    }
    static boolean contains(int a, int ... varargs) {
        for (int i = 0; i < varargs.length; i++) {
            if(a == varargs[i]) {
                return true;
            } else {

            }
        }
        return false;
    }
}
