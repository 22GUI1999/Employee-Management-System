public abstract class Employee {
    public  static int ids;
    public  int id;
     String name;
     public static Employee Manager;
    double baseSalary;
   public static int status ;
    public Employee (String name, double baseSalary){
        this.name =name;
        this.baseSalary=baseSalary;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public String getName(){
        return name;
    }
    public static int getEmployeeID(){
        ids++;
        int id =ids;
        return id;
        }
    public Employee getManager(){
        return Manager;

    }
    public boolean equals(Employee other){
        if (this.id==other.id){
            return true;
        } else{
            return false;
        }
    }
    public String toString(){
        String ID=Integer.toString(id);
        return (ID+ " " +getName());
    }
    public abstract String employeeStatus();


}
