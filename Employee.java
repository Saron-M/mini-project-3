package company;
public abstract class Employee {
    private String name;
    private int salary;
    protected String department;

    Employee(String name, int salary, String department) {
        this.name=name;
        this.salary=salary;
        this.department=department;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary=salary;
    }
    public String getDepartment() {
        return department;
    }
    public void displayInfo() {
        System.out.println("Name: "+ name);
        System.out.println("Salary: $"+ salary);
        System.out.println("Department: "+ department);
    }
    abstract double calculateBonus() ;

    final void companyPolicy() {
        System.out.println("Employees should maintain professionalism and integrity."); 
    }
}
