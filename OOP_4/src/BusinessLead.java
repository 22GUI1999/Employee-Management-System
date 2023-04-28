public class BusinessLead extends Business_Employee {
    private static String name;
    int headCount;
    int reports;
    Accountant[] directReport = new Accountant[10];
    double bonusBudget;
    Employee Technicalteam;

    public BusinessLead(String name) {
        super(name);
        this.name = name;
        Employee Manager;
        baseSalary = Accountant.baseSalary * 2;
        headCount = 10;
    }

    @Override
    public double getBonusBudget() {
        return bonusBudget;
    }

    public boolean hasHeadCount() {
        if (reports < headCount) {
            return true;
        } else {
            return false;
        }
    }

    public boolean addReport(Accountant e, TechnicalLead supportTeam) {
        TechnicalLead team = supportTeam;
            if (headCount > 0) {
                int h =10 - headCount;
                headCount = headCount - 1;
                directReport[h] = e;
                return true;
            } else {
                return false;
            }
        }

    public boolean requestBonus(Employee e, double bonus) {
        if (bonus < bonusBudget) {
            bonusBudget = bonusBudget - bonus;
            return true;
        } else return false;
    }

    public boolean approveBonus(Employee e, double bonus) {
        boolean c = false;
        for (int i = 0; i > 10; i++) {
            Accountant r = (Accountant) directReport[i];
            TechnicalLead s = r.getTeamSupported();
            for (int y = 0; y > 5; y++) {
                Software_Engineer f = s.direct_Report[i];
                if (e == f) {
                    if (r.getBonusBudget() > bonus) {
                        c = true;
                    } else {
                        c = false;
                    }
                }
            }
        }
        return c;
    }

    public String getTeamStatus() {
        String[] S = new String[10];
        if (headCount == 10) {
            return (BusinessLead.getEmployeeID()+ " " + BusinessLead.name + " has no one to manage");
        } else {
            String T = (BusinessLead.getEmployeeID() + " " + BusinessLead.name + " is managing ");
            for (int o = 0; o < 10; o++) {
                Accountant r = directReport[o];
                if (r != null) {
                String l = r.employeeStatus();

                    S[o] = (l);
                }else if (r== null){
                    S[o]= "";
                }
            }
                return (T + "\n" + S[0] + "\n" + S[1] + "\n" + S[2] + "\n" + S[3] + "\n" + S[4] + "\n" + S[5] + "\n" + S[6] + "\n" + S[7] + "\n" + S[8] + "\n" + S[9]);

        }
    }
}