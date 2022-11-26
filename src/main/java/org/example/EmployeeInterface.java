package org.example;

public class EmployeeInterface implements Proxy{

    String eid,password;
    EmployeeList singleton=EmployeeList.returnList();
    EmployeeInterface(String eid,String password){
        this.eid=eid;
        this.password=password;
    }

    @Override
    public void gotoInterface() {

    }
}
