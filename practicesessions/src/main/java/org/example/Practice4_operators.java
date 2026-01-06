package org.example;

import java.util.Scanner;

public class Practice4_operators {
    public void arthimetic(int a,int b){
        System.out.println("Addition = " + (a+b));
        System.out.println("Subtraction = "+ (a-b));
        System.out.println("Multiplication = "+ (a*b));
        System.out.println("Division = "+ (a/b));
        System.out.println("Modulus = "+ (a%b));
    }

    public void relational(int a,int b){
        System.out.println("Equals comparison for a == b is" + (a==b));
        System.out.println("Not Equals comparison for a != b is"+ (a!=b));
        System.out.println("Greater than comparison for a > b is"+ (a>b));
        System.out.println("Less than comparison for a < b is"+ (a<b));
        System.out.println("Greater than or equals to comparison for a >= b is"+ (a>=b));
        System.out.println("Less than or equals to comparison for a <= b is"+ (a<=b));
    }

    public void assignment(int a,int b){
        System.out.println("For assigning the vale we use = " + (a=5));
        System.out.println("For addition and assigning we use +="+ (a+=5));
        System.out.println("For Subtraction and assigning we use -="+ (a-=5));
        System.out.println("For Multiply and assigning we use *="+ (a*=5));
        System.out.println("For division and assigning we use /="+ (a/=5));
        System.out.println("For modulus and assigning we use %="+ (a%=5));
    }

    public void logical(boolean x,boolean y){
        System.out.println("Logical AND we use && for example : " + (x && y));
        System.out.println("Logical OR we use || for example : " + (x || y));
        System.out.println("Logical NOT we use ! for example : " + (! y));
    }

    public void bitwise(int a,int b){
        System.out.println("Bitwise AND is represented as (&) : " + (a&b));
        System.out.println("Bitwise OR is represented as (|) : " + (a|b));
        System.out.println("Bitwise XOR is represented as (^) : " + (a^b));
        System.out.println("Bitwise Compliment is represented as (~) : " + (~b));
        System.out.println("Bitwise Leftshift is represented as (<<) : " + (a << 4));
        System.out.println("Bitwise RightShift is represented as (>>) : " + (b >> 4));
        System.out.println("Bitwise Rightshift with zero insert is represented as (>>>) : " + (b >>> 4));
    }
    
    public void ternary(int a, int b){
        int c = a==b?a:b;
        System.out.println(" ternary conditional is represented by ? : "+ c);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input for the following numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter only true or false");
        boolean x = sc.nextBoolean();
        boolean y = sc.nextBoolean();
        Practice4_operators obj = new Practice4_operators();
        obj.arthimetic(a,b);
        obj.relational(a,b);
        obj.assignment(a,b);
        obj.bitwise(a,b);
        obj.ternary(a,b);
        obj.logical(x,y);
    }
}
