public class Employee {
    String name;
    double salary;
    String department;

    Employee(String name, double salary, String department) {
        this.name=name;
        this.salary=salary;
        this.department=department;
    }
    void displayInfo() {
        System.out.println("Name: "+ name);
        System.out.println("Salary: $"+ salary);
        System.out.println("Department: "+ department);
    }
    double calculateBonus() {
        return salary * 0.05;
    }
    String getDepartment() {
        return department;
    }
}
