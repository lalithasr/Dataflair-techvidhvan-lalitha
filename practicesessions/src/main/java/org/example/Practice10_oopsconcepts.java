package org.example;

import java.util.Scanner;

public class Practice10_oopsconcepts {
    int instanceVariable;
    public int evenorodd(int x){
        if(x%2 == 0){
            System.out.println("Number is even " + x);
        } else {
            System.out.println("Number is odd" + x);
        }

        return x ;
    }

    public void greaterThan(int x, int y){
        if(x>y){
            System.out.println(x + " is greater than "+ y);
        } else {
            System.out.println(y + " is greater than "+ x);
        }
    }
    public static void main(String[] args){
        int n;//cannot use the local variable with out declaring it
        Practice10_oopsconcepts myobj = new Practice10_oopsconcepts();
        System.out.println(myobj.instanceVariable);
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        myobj.greaterThan(x,y);
        myobj.evenorodd(x);

    }
}
