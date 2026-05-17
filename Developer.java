package company;
public class Developer extends Employee {
    String language;

    Developer(String name, int salary, String department, String language) {
        super(name, salary, department);
        this.language=language;
    }
     @Override
     double calculateBonus() {
        return getSalary()*0.12;
     }
     public void showDeveloper() {
        displayInfo();
        System.out.println("programming Language: "+ language);
     }
}
