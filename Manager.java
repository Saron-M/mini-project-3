package company;
public class Manager extends Employee {
    int bonusExtra;
    Manager(String name, int salary, String department, int bounudExtra) {
        super(name, salary, department);
        this.bonusExtra=bonusExtra;
    }
    @Override
    double calculateBonus() {
        return getSalary()*0.08 + bonusExtra;
    }
    public void showManager() {
        displayInfo();
        System.out.println("Extra Bonus: $" + bonusExtra);
    }
}
