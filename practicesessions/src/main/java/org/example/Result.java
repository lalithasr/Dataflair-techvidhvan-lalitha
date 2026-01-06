package org.example;

import java.util.Scanner;

public class Result {
    private int hindimarks;
    private int engmarks;
    private int mathmarks;
    private int socialmarks;
    private int computermarks;
    private long total;
    private double percentage;

    public void getdata(int hindimarks, int engmarks, int mathmarks,int socialmarks,int computermarks){
        System.out.println(" marks scored in the each subject are shown as below");
        System.out.println("Hindi marks" + hindimarks);
        System.out.println("English marks" + engmarks);
        System.out.println("Math marks" + mathmarks);
        System.out.println("Social marks" + socialmarks);
        System.out.println("Computer science marks" + computermarks);
    }

    public void calculate(long total, int hindimarks, int engmarks, int mathmarks,int socialmarks,int computermarks){
        total = hindimarks + engmarks + mathmarks + socialmarks + computermarks;
        System.out.println(total);
    }

    public String putdata(int hindimarks, int engmarks, int mathmarks,int socialmarks,int computermarks, long total){
        return "You have scored "+ hindimarks +" in Hindi subject" + engmarks +" in English subject"+mathmarks+" in Maths subject" + socialmarks+" in Social subject" + computermarks +" in Computer subject";
    }

    public static void main(String args[]){
        Result myobj = new Result();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Hindi marks");
        int hindimarks = sc.nextInt();
        System.out.println("Enter the English marks");
        int engmarks =  sc.nextInt();
        System.out.println("Enter the Maths marks");
        int mathmarks = sc.nextInt();;
        System.out.println("Enter the Social marks");
        int socialmarks = sc.nextInt();
        System.out.println("Enter the Computer marks");
        int computermarks = sc.nextInt();
        long total = hindimarks + engmarks + mathmarks + socialmarks + computermarks;
        myobj.getdata(hindimarks,engmarks,mathmarks,socialmarks,computermarks);
        myobj.calculate(total,hindimarks,engmarks,mathmarks,socialmarks,computermarks);
        myobj.putdata( hindimarks,engmarks,mathmarks,socialmarks,computermarks,total);
    }
}
