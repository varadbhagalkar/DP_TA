package org.example;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeList {
    //singleton for employee
    ArrayList<Employee> empList=new ArrayList<>();
    private EmployeeList(){}

    private static EmployeeList singleton=new EmployeeList();

    public void addEmp(Employee emp){
        empList.add(emp);
    }

    public void removeEmp(String eid){
        Iterator itr = empList.iterator();
        while(itr.hasNext()){
            String listEid=(String)itr.next();
            if (eid==listEid){
                itr.remove();
            }
        }
    }

    public void salEdit(String eid,int updatedSal){
        Iterator itr = empList.iterator();
        while(itr.hasNext()){
            String listEid=(String)itr.next();
            if (eid==listEid){
                itr.salary=updatedSal;
            }
        }
    }

    public static EmployeeList returnList(){
        return singleton;
    }

    public void edit(String name,String password,String eid){
        Iterator itr = empList.iterator();
        while(itr.hasNext()){
            String listEid=(String)itr.next();
            if (eid==listEid){
                itr.name=name;
                itr.password=password;
            }
        }
    }



}
