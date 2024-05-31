package com.test;

public class Smallestnum {
    public static void main (String[]args){
        int a = 20, b = 30, c = 15;
        if (a<b && a<c)
        {
            System.out.println(a+ "is the smallestnum");
        }
        else if (b<a && b<c)
        {
            System.out.println(b+ "is the smallestnum");
        }
        else {
            System.out.println(c+ "is the smallestnum");
        }
    }
}
