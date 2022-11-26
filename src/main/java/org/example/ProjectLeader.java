package org.example;

public class ProjectLeader extends Employee {
    private final int MAX_LEAVES_CAN_APPROVE = 20;

    ProjectLeader(String name, String eid, String password, int salary) {
        super(name, eid, password, salary);
    }

    @Override
    public void applyLeave(int numberofDaysLeave) {
        supervisor.ApproveLeave(this.eid, numberofDaysLeave);
    }

    @Override
    void ApproveLeave(String eid, int numberofDaysLeave) {

        if (numberofDaysLeave <= MAX_LEAVES_CAN_APPROVE) {
            System.out.println("TeamLeader approved " + numberofDaysLeave + " days " + "Leave for the employee : "
                    + eid);
        } else {
            supervisor.ApproveLeave(eid, numberofDaysLeave);
        }
    }

    @Override
    public void applyRaise(int amountOfRaise) {
        supervisor.ApproveRaise(this.eid, amountOfRaise);
    }

    @Override
    void ApproveRaise(String eid, int numberofDaysLeave) {

    }
}