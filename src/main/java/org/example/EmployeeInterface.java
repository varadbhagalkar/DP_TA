package org.example;

import java.util.Scanner;



public class EmployeeInterface implements Proxy{
    String eid,password;
    EmployeeList singleton=EmployeeList.returnList();
    Scanner in = new Scanner(System.in);
    EmployeeInterface(String eid,String password){
        this.eid=eid;
        this.password=password;
        gotoInterface();
    }

    @Override
    public void gotoInterface() {
        int n = 0;
        while(n==0){
            System.out.println("1. For details");
            System.out.println("2. For Applying leave");
            System.out.println("3. For Applying raise");
            System.out.println("4. For Edit profile");
            System.out.println("5. For resign");

            
            n = in.nextInt();
            switch(n){
                case 1 -> {
                    singleton.details(eid);
                }
                case 2 ->{
                    System.out.println("Enter no. of days to leave : ");
                    int v = in.nextInt();
                    singleton.leave(eid, v);
                }
                case 3 ->{
                    System.out.println("Enter no. of days to leave : ");
                    int v = in.nextInt();
                    singleton.raise(eid, v);
                }
                case 4 ->{
                    System.out.println("Enter name : ");
                    String v = in.nextLine();
                    System.out.println("Enter password: ");
                    String x = in.nextLine();
                    singleton.edit(v, x, eid);
                }
                case 5 ->{
                    singleton.removeEmp(eid);
                    return;
                }
            }
        }
    }
}
