package org.example;

public class Practice5_statements {
    public void ifmethod(int n){
        if(n < 5)
            System.out.println("Number is less than 5");
        if(n > 5)
            System.out.println("Number is greater than 5");
        else
            System.out.println("Number is zero");
    }

    public void ifelsemethod(boolean a, boolean b){
        if(a = b = false)
            System.out.println("if the statement is true");
        else
            System.out.println("if the statement is false");
    }

    public void random1if(int n){
        if(n++==5 && n++==6 && n++==7)
            ++n;
        System.out.println(n);

    }

    public static void main(String[] args){
        Practice5_statements myobj = new Practice5_statements();
        myobj.ifmethod(6);
        myobj.ifmethod(3);
        boolean a = true;
        boolean b = true;
        myobj.ifelsemethod(true, true);
        myobj.random1if(7);
    }
}
