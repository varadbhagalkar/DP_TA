package org.example;

import java.util.Scanner;



public class EmployeeInterface implements Proxy{
    String eid,password;
    EmployeeList singleton=EmployeeList.returnList();
    Scanner in = new Scanner(System.in);
    EmployeeInterface(String eid,String password){
        this.eid=eid;
        this.password=password;
    }

    @Override
    public void gotoInterface() {
        int n = 1;
        while(n!=0){
            System.out.println("");
            System.out.println("");
            System.out.println("-----------------------------");
            System.out.println("1. For details");
            System.out.println("2. For Applying leave");
            System.out.println("3. For Applying raise");
            System.out.println("4. For Edit profile");
            System.out.println("5. For resign");
            System.out.println("6. For exit");
            System.out.println("-----------------------------");
            
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
                    System.out.println("Enter no. of amt to raise : ");
                    int v = in.nextInt();
                    singleton.raise(eid, v);
                }
                case 4 ->{
                    in.nextLine();
                    System.out.println("Enter name : ");
                    String v = in.nextLine();
                    System.out.println("Enter password: ");
                    String x = in.nextLine();
                    singleton.edit(v, x, eid);
                }
                case 5 ->{
                    singleton.removeEmp(eid);
                    n=0;
                }
                case 6 ->{
                    n=0;
                }
                default ->{
                    System.out.println("Invalid input");
                }
            }
        }
    }
}
