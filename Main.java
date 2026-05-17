package company;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        ArrayList<Employee>employees=new ArrayList<>();
        try {
            System.out.print("Enter Manager Name");
            String managername=input.nextline();

            System.out.print("Enter Manager Salary;");
            int managersalary=input.nextint();
            input.nextline();

            System.out.print("Enter Developer Name");
            String developername=input.nextline();

            System.out.print("Enter Developer Salary;");
            int developersalary=input.nextint();
            input.nextline();

        
      Employee e1= new Manager("Abebe", 50000,"IT",3000);
      Employee e2 = new Developer("Sara", 60000,"HR","java");

      employees.add(e1);
      employees.add(e2);

      for (Employee emp: employees) {
        emp.displayInfo();
        System.out.println("Bonus: $"=emp.calculateBonus());
        emp.companyPolicy();
        System.out.println("Employees should maintain professionalism and integrity.")
      }
    }
    
       catch (Exception e) {
        System.out.println("Invalid Input!");
       }
      input.close();
    }
}

