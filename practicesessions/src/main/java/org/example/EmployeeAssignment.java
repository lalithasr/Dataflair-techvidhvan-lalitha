package org.example;

import java.util.Scanner;

public class EmployeeAssignment {
    int id;
    String name;
    double salary;
    public void getinfo(String name,int id,double salary){
        System.out.println("Person you entered is: " + name + " whose id is " + id + " who is getting salary of " + salary);
    }
    public void displayinfo(String name,int id,double salary){
        System.out.println("Person you entered is: " + name + " whose id is " + id + " who is getting salary of " + salary);
    }
    public static void main(String args[]){
        EmployeeAssignment myobj = new EmployeeAssignment();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name = sc.next();
        System.out.println("Enter the ID");
        int id = sc.nextInt();
        System.out.println("Enter the salary");
        double salary = sc.nextDouble();
        myobj.getinfo(name,id,salary);
        myobj.displayinfo(name,id,salary);
    }
}
