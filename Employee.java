public class Employee {
    protected String name;
    protected int salary;
    protected String department;

    Employee(String name, int salary, String department) {
        this.name=name;
        this.salary=salary;
        this.department=department;
    }
    public void displayInfo() {
        System.out.println("Name: "+ name);
        System.out.println("Salary: $"+ salary);
        System.out.println("Department: "+ department);
    }
    public double calculateBonus() {
        return salary * 0.05;
    }
   public String getDepartment() {
        return department;
    }
    final void companyPolicy() {
        System.out.println("Follow company rules."); 
    }
}
