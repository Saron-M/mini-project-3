public class Main {
    public static void main(String[]args){
    
    Employee e1= new Employee("Abebe", 50000,"IT");
    Employee emp2 = new Employee("Sara", 60000,"HR");
    Manager m1 = new Manager("Biruk", 80000, "Management", 5000);
    Developer d1 = new Developer("Mike", 70000, "IT", "Java");

        e1.displayInfo();
        System.out.println("Bonus: $" + e1.calculateBonus());

        emp2.displayInfo();
        System.out.println("bonus: $"+emp2.calculateBonus());

        m1.displayInfo();
        System.out.println("Manager Bonus: $" + m1.calculateBonus());

        d1.showDeveloper();
    }
}

