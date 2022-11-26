package org.example;

public class HR extends Employee{
    private final int MAX_LEAVES_CAN_APPROVE = 30;

    HR(String name,String eid,String password,int salary){
        super(name,eid,password,salary);
    }


    @Override
    void ApproveLeave( String eid, int numberofDaysLeave ){

        if( numberofDaysLeave <= MAX_LEAVES_CAN_APPROVE ){
            System.out.println("TeamLeader approved " + numberofDaysLeave + " days " + "Leave for the employee : "
                    + eid);
        }
        else{
            System.out.println("Leave for the employee "+ eid+" is rejected");
        }
    }

    @Override
    void ApproveRaise( String eid, int numberofDaysLeave){

    }

    @Override
    public void applyLeave(int numberOfDaysLeave) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void applyRaise(int amountOfRaise) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
