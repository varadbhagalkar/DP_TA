package org.example;

public class HR extends Employee{
    private final int MAX_RAISE_CAN_APPROVE = 90000;
    private final int MAX_LEAVES_CAN_APPROVE = 30;

    HR(String name,String eid,String password,int salary){
        super(name,eid,password,salary);
    }


    @Override
    void ApproveLeave( String eid, int numberofDaysLeave ){

        if( numberofDaysLeave <= MAX_LEAVES_CAN_APPROVE ){
            System.out.println("HR approved " + numberofDaysLeave + " days " + "Leave for the employee : "
                    + eid);
        }
        else{
            System.out.println("Leave for the employee "+ eid+" is rejected");
        }
    }

    @Override
    void ApproveRaise( String eid, int amountOfRaise){
        if( amountOfRaise <= MAX_RAISE_CAN_APPROVE ){
           EmployeeList l1 = EmployeeList.returnList();
           l1.salEdit(eid,amountOfRaise);
       }
       else{
            System.out.println("Raise for the employee "+ eid+" is rejected");
       }
    }

    @Override
    public void applyLeave(int numberOfDaysLeave) {
        System.out.println("Hr cannot ask for leave");
    }

    @Override
    public void applyRaise(int amountOfRaise) {
        System.out.println("HR's salary will be increase to 1234456776");
    }
}
