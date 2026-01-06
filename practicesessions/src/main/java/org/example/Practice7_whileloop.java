package org.example;

import java.util.Scanner;

public class Practice7_whileloop {
    int r, n, s = 0;
    public void numreverse(int n){
        while (n!=0) {
            r = n % 10;
            s = s * 10 + r;
            n = n / 10;
        }
        System.out.println(s);
    }
    public static void main(String args[]){
        Practice7_whileloop myobj = new Practice7_whileloop();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        myobj.numreverse(n);



    }
}
