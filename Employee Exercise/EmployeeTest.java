public class EmployeeTest {

    public  static  void display_employee_details (Employee employee_object) {
        System.out.println("Name: "+employee_object.getName()+"\nRole: "+employee_object.getRole()+"\nSalary: "+employee_object.getSalary());
        System.out.println();
        System.out.println();
    }

    public static void modify_employee_salary (Employee employee_object) {

        double current_salary = employee_object.getSalary();
        double added_salary = (current_salary * 10)/100;
        double new_salary = current_salary + added_salary;

        employee_object.setSalary(new_salary);
    }

    public static void main (String[] args) {

        Employee employee_1 = new Employee("Shimwa Benjamin","Software Engineer",1200000.500);
        Employee employee_2 = new Employee("Isimbi Cynthia","Nurse",-10);

        EmployeeTest.display_employee_details(employee_1);
        EmployeeTest.display_employee_details(employee_2);

        employee_2.setSalary(1300000);

        EmployeeTest.modify_employee_salary(employee_1);
        EmployeeTest.modify_employee_salary(employee_2);

        EmployeeTest.display_employee_details(employee_1);
        EmployeeTest.display_employee_details(employee_2);

    }
}
