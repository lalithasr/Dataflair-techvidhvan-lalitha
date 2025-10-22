package org.example;

import java.util.Scanner;

public class Practice9_loopstopics {
    public void forloop(){
        for(int i = 1; i <=5; i++){
            System.out.println("Iteration : " + i);
        }
        for(int i = 2; i <= 10; i += 2){
            System.out.println("Even numbers from 1 to 10 "+i);
        }
    }
    public void whileloop(int num){
        int i = 1;
        while (i <= 5){
            System.out.println("Count of i is "+i);
            i++;
        }

        while(num != 0){
            System.out.println("You entered "+ num);
        }
    }
    public static void main(String args[]){
        Practice9_loopstopics myobj = new Practice9_loopstopics();
        myobj.forloop();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        myobj.whileloop(num);
    }
}
