package org.example;

public class Practice8_forloop {

    public void forexample1(){
        int i = 7;
        for( i = 1; i >= 6; i++){
            System.out.println(i);
        }
        for( i = 1; i >= 5; )
            System.out.println(i);

        System.out.println(i);
    }
    public void forexample2(){
        int i= 1;
        for( i=1;i <=5;i++){
            if(i == 3)
                continue;
            if(i == 5)
                break;
            System.out.println(i);
        }
    }
    public void forexample3(){
        int i, j;
        for( i = 1; i <=5; i++){
            for( j = 1; j<=5 ; j++){
               if(i == j)
                   break;
            }
            break;
        }
    }
    public void forexample4(){
        int i, j;
        for( i = 1; i <=5; i++){
            for( j = 1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public void forexample5(){
        int i, j;
        for( i = 1; i <=5; i++){
            for( j = 1; j<=i ; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public void forexample6(){
        int i, j;
        for( i = 1; i <=5; i++){
            for( j = 1; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void forexample7(){
        int i, j;
        for( i = 5; i >=1; i--){
            for( j = 1; j<=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void forexample8(){
        int i, j;
        for( i = 5; i >=1; i--){
            for( j = i; j>=1 ; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public void forexample9(){
        char i, j;
        for( i = 'A'; i <= 'E'; i++ ){
            for(j = 'A'; j <= i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public void forexample10(){
        char i, j;
        System.out.println("new one");
        for( i = 'E'; i >= 'A'; i-- ){
            for(j = 'A'; j <= i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Practice8_forloop myobj = new Practice8_forloop();
        myobj.forexample1();
        myobj.forexample2();
        myobj.forexample3();
        myobj.forexample4();
        myobj.forexample5();
        myobj.forexample6();
        myobj.forexample7();
        myobj.forexample8();
        myobj.forexample9();
        myobj.forexample10();
    }
}
