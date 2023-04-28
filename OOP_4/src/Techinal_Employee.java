public abstract class Techinal_Employee extends Employee {
    public static double baseSalary;


    public Techinal_Employee(String name) {
        super(name, 75000);
    }
     public String add_visit(int add) {
        status = status + add;
        return (toString() + " has " +status+ " successful visits");
    }

    public String employeeStatus() {
        return (toString() + " has " +status+ " successful visits");
    }
}

