package org.example;

public class Programmer extends Employee{
    Programmer(String name,String eid,String password,int salary){
        super(name,eid,password,salary);
    }

    @Override
    public void applyLeave(int numberofDaysLeave ){
        supervisor.ApproveLeave(this.eid, numberofDaysLeave);
    }

    @Override
    public void applyRaise(int amountOfRaise) {
        supervisor.ApproveRaise(this.eid, amountOfRaise);
    }

}