package org.example;

public class ProjectLeader extends Employee {
    private final int MAX_RAISE_CAN_APPROVE = 60000;
    private final int MAX_LEAVES_CAN_APPROVE = 20;

    ProjectLeader(String name, String eid, String password, int salary) {
        super(name, eid, password, salary);
    }

    @Override
    public void applyLeave(int numberofDaysLeave) {
        System.out.println("Leave for the employee "+ eid+" is forwarded to HR");
        supervisor.ApproveLeave(this.eid, numberofDaysLeave);
    }

    @Override
    void ApproveLeave(String eid, int numberofDaysLeave) {

        if (numberofDaysLeave <= MAX_LEAVES_CAN_APPROVE) {
            System.out.println("Project Leader approved " + numberofDaysLeave + " days " + "Leave for the employee : "
                    + eid);
        } else {
            System.out.println("Leave for the employee "+ eid+" is forwarded to HR");
            supervisor.ApproveLeave(eid, numberofDaysLeave);
        }
    }

    @Override
    public void applyRaise(int amountOfRaise) {
        supervisor.ApproveRaise(this.eid, amountOfRaise);
    }

    @Override
    void ApproveRaise( String eid, int amountOfRaise){
        if( amountOfRaise <= MAX_RAISE_CAN_APPROVE ){
           EmployeeList l1 = EmployeeList.returnList();
           l1.salEdit(eid,amountOfRaise);
       }
       else{
          supervisor.ApproveRaise(eid, amountOfRaise);
       }
    }
}