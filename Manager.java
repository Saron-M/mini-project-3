public class Manager extends Employee {
    int bonusExtra;
    Manager(String name, double salary, String department, int bounudExtra) {
        super(name, salary, department);
        this.bonusExtra=bonusExtra;
    }
    @Override
    double calculateBonus() {
        return super.calculateBonus() + bonusExtra;
    }
    public void showManager() {
        displayInfo();
        System.out.println("Extra Bonus: $" + bonusExtra);
    }
}
