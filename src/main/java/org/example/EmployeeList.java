package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeList {
    //singleton for employee
    ArrayList<Employee> empList=new ArrayList<>();
    private EmployeeList(){
        singleton.addEmp(new HR("ved","111","12345678",100000));
        singleton.addEmp(new ProjectLeader("Rahul","112","123123",70000));
        singleton.addEmp(new TeamLeader("varad","113","123",70000));
        singleton.addEmp(new Programmer("paliwal","114","123123",70000));
    }

    private static final EmployeeList singleton=new EmployeeList();

    public void addEmp(Employee emp){
        empList.add(emp);
    }

    public void removeEmp(String eid){
        Iterator itr = empList.iterator();
        while(itr.hasNext()){
            String listEid=(String)itr.next();
            if (eid.equals(listEid)){
                itr.remove();
            }
        }
    }

    public void salEdit(String eid,int updatedSal){
        for(Employee emp:empList){
            if(emp.eid.equals(eid)){
                emp.salary=updatedSal;
            }
        }
    }

    public static EmployeeList returnList(){
        return singleton;
    }

    public void edit(String name,String password,String eid){
        for(Employee emp:empList){
            if(emp.eid.equals(eid)){
                emp.name=name;
                emp.password=password;
            }
        }
    }
    
    public void details(String eid){
        for(Employee emp:empList){
            if(emp.eid.equals(eid)){
                System.out.println("Employee ID : "+ emp.eid);
                System.out.println("Name : "+ emp.name);
                System.out.println("Salary : "+ emp.salary);
            }
        }
    }

    public boolean check(String eid,String password){
        for(Employee emp:empList){
            if(emp.eid.equals(eid)){
                return emp.password.equals(password);
            }
        }
        return false;
    }
    
    public void leave(String eid, int days){
        for(Employee emp:empList){
            if(emp.eid.equals(eid)){
                emp.ApproveLeave(eid, days);
            }
        }
    }

    public void raise(String eid, int amt){
        for(Employee emp:empList){
            if(emp.eid.equals(eid)){
                emp.ApproveRaise(eid, amt);
            }
        }
    }

}
