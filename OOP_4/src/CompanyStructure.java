 public class CompanyStructure {
        public static void main(String[] args) {
            TechnicalLead CTO = new TechnicalLead("Satya Nadella");
            Software_Engineer seA = new Software_Engineer("Kasey");
            Software_Engineer seB = new Software_Engineer("Breana");
            Software_Engineer seC = new Software_Engineer("Eric");

            CTO.addReport(seA);
            CTO.addReport(seB);
            CTO.addReport(seC);
            System.out.println(CTO.getTeamStatus());

            TechnicalLead VPofENG = new TechnicalLead("Bill Gates");
            Software_Engineer seD = new Software_Engineer("Winter");
            Software_Engineer seE = new Software_Engineer("Libby");
            Software_Engineer seF = new Software_Engineer("Gizan");
            Software_Engineer seG = new Software_Engineer("Zaynah");
            VPofENG.addReport(seD);
            VPofENG.addReport(seE);
            VPofENG.addReport(seF);
            VPofENG.addReport(seG);
            System.out.println(VPofENG.getTeamStatus());

            BusinessLead CFO = new BusinessLead("Amy Hood");
            Accountant actA = new Accountant("Niky");
            Accountant actB = new Accountant("Andrew");
            CFO.addReport(actA, CTO);
            CFO.addReport(actB, VPofENG);
            System.out.println(CFO.getTeamStatus());
        }

    }
