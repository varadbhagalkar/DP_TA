package org.example;

import java.util.Scanner;

public class Main {
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Enter Employee ID:");
        String v = in.nextLine();
        System.out.println("Enter Password:");
        String x = in.nextLine();
        EmployeeLogin e1 = new EmployeeLogin(v,x);

    }
}