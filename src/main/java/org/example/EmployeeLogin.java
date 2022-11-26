package org.example;

public class EmployeeLogin implements Proxy{

    String eid,password;
    EmployeeList singleton=EmployeeList.returnList();
    EmployeeLogin(String eid,String password){
        this.eid=eid;
        this.password=password;
    }




    @Override
    public void gotoInterface() {
        if(singleton.check(eid,password)){
            EmployeeInterface employeeInterface = new EmployeeInterface(eid,password);
        }
    }
    //proxy for checking employee
    //options to apply for leave,appraisal,resign

}
