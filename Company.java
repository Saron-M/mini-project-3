public class Company {
    public static void main(String[] args) {
       
        Employee emp1 = new Employee("Abebe", 50000, "IT");
        Employee emp2 = new Employee("Sara", 60000, "HR");
        Manager m1 = new Manager("Biruk",80000, "Management", 5000);

        emp1.displayInfo();
        System.out.println("bonus: $"+emp1.calculateBonus());
        
        emp2.displayInfo();
        System.out.println("bonus: $"+emp2.calculateBonus());

        m1.showManager();
        System.out.println("Total Bonus: $"+ m1.calculateBonus());
    }
}
