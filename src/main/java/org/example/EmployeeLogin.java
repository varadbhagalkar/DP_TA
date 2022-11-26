package org.example;

import java.util.Scanner;

public class EmployeeLogin implements Proxy{
    Scanner in = new Scanner(System.in);
    String eid,password;
    EmployeeList singleton=EmployeeList.returnList();
    EmployeeLogin(){
        System.out.println("Enter Employee ID:");
        String v = in.nextLine();
        System.out.println("Enter Password:");
        String x = in.nextLine();
        this.eid=v;
        this.password=x;
    }




    @Override
    public void gotoInterface() {
        Employee o1 = new HR("ved","111","12345678",100000);
        Employee o2 = new ProjectLeader("Rahul","112","123123",70000);
        o2.setNextSupervisor(o1);
        Employee o3 = new TeamLeader("varad","113","123",70000);
        o3.setNextSupervisor(o2);
        Employee o4 = new Programmer("paliwal","114","123123",70000);
        o4.setNextSupervisor(o3);
        singleton.addEmp(o1);
        singleton.addEmp(o2);
        singleton.addEmp(o3);
        singleton.addEmp(o4);
        if(singleton.check(eid,password)){
            EmployeeInterface employeeInterface = new EmployeeInterface(eid,password);
            employeeInterface.gotoInterface();
        }
    }
    //proxy for checking employee
    //options to apply for leave,appraisal,resign

}
