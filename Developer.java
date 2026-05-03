public class Developer extends Employee {
    String language;

    Developer(String name, int salary, String department, String language) {
        super(name, salary, department);
        this.language=language;
    }
     
     public void showDeveloper() {
        displayInfo();
        System.out.println("Language: "+ language);
     }
}
