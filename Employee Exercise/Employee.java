public class Employee {

    private String name,role;
    private double salary;


    public String getRole () {
        return this.role;
    }

    public String getName () {
        return this.name;
    }

    public double getSalary () {
            return this.salary;
    }

    public void setRole (String role) {
        this.role = role;
    }

    public void setSalary (double salary) {
        if (salary > 0)
            this.salary = salary;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Employee (String name, String role, double salary) {
        setName(name);
        setRole(role);
        setSalary(salary);
    }
}
