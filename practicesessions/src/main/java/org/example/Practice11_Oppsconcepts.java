package org.example;

public class Practice11_Oppsconcepts {
    private int a = 10;
    public void increment(){
        ++a;
        System.out.println(a);
    }
    public void display(){
        System.out.println(a);
    }
    public static void main(String args[]){
        Practice11_Oppsconcepts myobj1 = new Practice11_Oppsconcepts();
        myobj1.display();
        myobj1.increment();
        myobj1.increment();
        myobj1.display();
        Practice11_Oppsconcepts myobj2 = new Practice11_Oppsconcepts();
        myobj2.increment();
        myobj2.display();
        myobj2.increment();
        Practice11_Oppsconcepts myobj3 = new Practice11_Oppsconcepts();
        myobj3.increment();
        myobj3.display();
        System.out.println("testing the logic");
        Practice11_Oppsconcepts myobj4 = myobj1;
        myobj4.increment();
        myobj4.display();
        myobj4.increment();
        myobj1 = null;
        myobj4.increment();
        myobj4.display();

    }
}
