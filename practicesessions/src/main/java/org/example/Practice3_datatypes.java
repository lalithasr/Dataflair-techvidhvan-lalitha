package org.example;

import java.util.Scanner;

public class Practice3_datatypes {
    public static void main(String args[]){
        byte a;
        int b;
        short c;
        long d;
        double e;
        char f;
        float g;
        boolean h;
        Scanner sc = new Scanner(System.in);
        a = sc.nextByte();
        b = sc.nextInt();
        c = sc.nextShort();
        d = sc.nextLong();
        e = sc.nextDouble();
        f = sc.next().charAt(0);
        g = sc.nextFloat();
        h = sc.nextBoolean();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
    }
}
