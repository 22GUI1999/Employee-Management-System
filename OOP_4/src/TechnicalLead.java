public class TechnicalLead extends Techinal_Employee {
    public static Software_Engineer[] direct_Report = new Software_Engineer[4];
    double baseSalary;
    public static int head_count;
    boolean reported;
    public static String name;
    static int i;
    static int approve;

    public TechnicalLead(String name) {
        super(name);
        this.name = name;
        baseSalary = Techinal_Employee.baseSalary * 1.3;
        head_count = 4;
    }

    public boolean hasHeadCount() {

        if (head_count > 0) {
            return true;
        } else
            return false;
    }

    public static boolean addReport(Software_Engineer e) {
        if (head_count > 0) {
            int h = 4 - head_count;
            direct_Report[h] = e;
            head_count = head_count - 1;
            return true;
        } else {
            return false;
        }
    }

    public static boolean approveCheckIn(Software_Engineer e, boolean reported) {
        boolean r = e.checkInCode();
        if (r = true && e.getCodeAccess() == true && reported == true) {
            approve = approve + 1;
            return true;
        } else return false;
    }

    public String getTeamStatus() {
        String[] S = new String[4];
        if (head_count == 4) {
            return (TechnicalLead.getEmployeeID() + TechnicalLead.name + " has " + approve + " successful check ins and no direct reports yet");
        } else {
            String T = (TechnicalLead.getEmployeeID() + " " + TechnicalLead.name + " has " + approve + " successful check ins and is managing \n");
            for (int o = 0; o < 4; o++) {
                Software_Engineer e = direct_Report[o];
                //  int f = direct_Report[o].getSuccessfulCheckIns();
                if (e==null){
                    S[o]="";
                } else if (e != null) {
                    String l = (getEmployeeID() + " " + e.getName() + " has " + e.getSuccessfulCheckIns() + " successful check ins ");
                    S[o] = l;
                }
            }
            return (T + S[0] + "\n" + S[1] + "\n" + S[2] + "\n" + S[3] + "\n" );
        }
    }
}
