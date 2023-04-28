public class Accountant extends Business_Employee {
    int BonusBudget;
    double budget;
    public static double baseSalary;
    TechnicalLead team;

    public Accountant(String name) {
        super(name);
        this.baseSalary=Business_Employee.baseSalary;
        int BonusBudget = 0;
    }

    public TechnicalLead getTeamSupported() {
        return team;
    }

    public void supportTeam(TechnicalLead lead) {
        team= lead;
        int d = TechnicalLead.head_count;
        int f = d - 1;
        double g = f * Software_Engineer.baseSalary;
        budget = g + 0.1 * g;
    }

    private double getBudget() {
        return budget;
    }

    public boolean approveBonus(double bonus) {
        if (bonus < getBudget() && team!=null) {
            return true;
        } else {
            return false;
        }
    }


    public String employeeStatus() {
        String l= (Accountant.getEmployeeID()+ " " +getName()+ " with a budget of " + BonusBudget + " is supporting " +team);
        return l;

    }

    @Override
    public double getBonusBudget() {
        return budget;
    }
}
