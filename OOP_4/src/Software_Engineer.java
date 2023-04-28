import java.util.Scanner;
public class Software_Engineer extends Techinal_Employee {
    private static int checkIn;
    private static String name;
    boolean access;


    public Software_Engineer(String name){
        super(name);
        Software_Engineer.name =name;
        checkIn = 0;
        boolean access = false;
    }

    public boolean getCodeAccess() {
        if (access == false) {
            return true;
        } else {
            return false;
        }
    }
    public void setCodeAccess(boolean access){
        this.access= access ;

    }
    public int getSuccessfulCheckIns(){
        return checkIn;
    }

    public static boolean checkInCode(){
        boolean i =TechnicalLead.addReport(new Software_Engineer(name));
        if(i==true) {
            checkIn=checkIn+1;
            return true;
        } else return false;
        }
}

