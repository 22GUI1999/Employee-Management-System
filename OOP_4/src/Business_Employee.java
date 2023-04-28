public abstract class Business_Employee extends Employee {
    private double BonusBudget;
    public static double  baseSalary;
    public Business_Employee(String name) {
        super(name, 50000);
    }

    public abstract double getBonusBudget();
    public String employeeStatus(){
        return (toString()+" with a budget of "+ BonusBudget);
    }
}
