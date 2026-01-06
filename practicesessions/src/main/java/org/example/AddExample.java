package org.example;

public class AddExample {
    public static void add(int a , int b )
    {
        int sum = a + b ;
        System.out.println(sum);
    }

    public static void main ( String args [] )

    {
        int a = 1;
        int b = 2;
        int sum = 5 ;
        AddExample.add(a,b);

        System.out.println("Sum is " + sum );

    }
}
