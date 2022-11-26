package org.example;


public abstract class Employee {
    String name, eid, password;
    int salary;
    Employee supervisor;

    Employee(String name, String eid, String password, int salary) {
        this.name = name;
        this.eid = eid;
        this.password = password;
        this.salary = salary;
    }

    public void setNextSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public abstract void applyLeave(int numberOfDaysLeave);

    public abstract void applyRaise(int amountOfRaise);

    void ApproveLeave(String eid, int numberofDaysLeave) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    void ApproveRaise(String eid, int amountOfRaise) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

