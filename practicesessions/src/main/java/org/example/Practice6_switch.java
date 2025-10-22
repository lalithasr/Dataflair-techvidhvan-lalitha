package org.example;

import java.util.Scanner;

public class Practice6_switch {
    public void condition1(int variables){
        switch (variables){
            case 1:
                System.out.println("The value of variable is :" + variables);
                break;
            case 2:
                System.out.println("The value of variable is :" + variables);
                break;
            case 3:
                System.out.println("The value of variable is :" + variables);
                break;
            case 4:
                System.out.println("The value of variable is :" + variables);
                break;
            default:
                System.out.println("The value of variable is out of range");
        }
    }

    public void withoutbreak(int variables){
        switch (variables){
            case 1:
                System.out.println("The value of variable is :" + variables);
            case 2:
                System.out.println("The value of variable is :" + variables);
            case 3:
                System.out.println("The value of variable is :" + variables);
            case 4:
                System.out.println("The value of variable is :" + variables);
            default:
                System.out.println("The value of variable is out of range");
        }
    }

    public void stringswitch(String course){
        switch (course){
            case "Java" :
                System.out.println("This is the java course"+ course);
                break;
            case "Python" :
                System.out.println("This is the Python course"+ course);
                break;
            default:
                System.out.println("Course is not yet registered");
        }
    }

    public void enumswitch(char c){
        switch (c){
            case 'A':
                System.out.println("This is the AI course");
                break;
            case 'B':
                System.out.println("This is the Java course");
                break;
            default:
                System.out.println("couldn't find the case");
        }
    }

    public void nestedswitch(String course, int version){
        switch (course){
            case "one":
                System.out.println("This is the nested switch: ");
                switch (version){
                    case 6:
                        System.out.println("This is the first one");
                        break;
                    case 7:
                        System.out.println("This is the second one");
                        break;
                    default:
                        System.out.println("Default case");
                }
            case "Two":
                System.out.println("This is just the another switch case");
                break;
            default:
                System.out.println("This is default statement");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int variables;
        System.out.println("Please enter the variable value");
        variables = sc.nextInt();
        String course = sc.next();
        Practice6_switch myobj =  new Practice6_switch();
        myobj.condition1(6);
        myobj.stringswitch("Python");
        myobj.nestedswitch("java",6);
        myobj.enumswitch('A');
        myobj.withoutbreak(5);
    }
}
