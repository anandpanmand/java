package oops;
/**
 * InnerMyEmployee
 */
 class Employee {
            int id;
            String name;
            int salary;
            public Employee(int id, String name, int salary) {
                this.id = id;
                this.name = name;
                this.salary = salary;
            }
            public Employee( int salary) {
                this.salary = salary;
            }
            public int getId() {
                return id;
            }
            public void setId(int id) {
                this.id = id;
            }
            public String getName() {
                return name;
            }
            public void setName(String name) {
                this.name = name;
            }
            public int getSalary() {
                return salary;
            }
            public void setSalary(int salary) {
                this.salary = salary;
            }

    
}
public class MyEmployee {
    public static void main(String[] args) {
        Employee anad =new Employee(10000);
        System.out.println(anad.getSalary());
    }
}
