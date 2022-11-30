package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeList {
    //singleton for employee
    ArrayList<Employee> empList=new ArrayList<>();
    private EmployeeList(){}

    private static final EmployeeList singleton=new EmployeeList();

    public void addEmp(Employee emp){
        empList.add(emp);
    }

    public void removeEmp(String eid){
        Iterator itr = empList.iterator();
        while(itr.hasNext()){
           Employee listEid=(Employee) itr.next();
            if (eid.equals(listEid.eid)){
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
                emp.applyLeave( days);
            }
        }
    }

    public void raise(String eid, int amt){
        for(Employee emp:empList){
            if(emp.eid.equals(eid)){
                emp.applyRaise(amt);
            }
        }
    }

}
