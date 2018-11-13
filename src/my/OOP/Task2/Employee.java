package my.OOP.Task2;

/*2. Написать класс Employee с полями id, firstName, lastName, salary.
//Cотрудник, идентификатор сотрудника, имя, фамилия, зарплата.
В классе предусмотреть методы для увеличения зарплаты на заданное количество %
//Planned increase in salary. и получения зарплаты за год.//annual salary*/
public class Employee {

    protected int id;
    protected String firstName;
    protected String lastName;
    protected double salary;
    protected double plannedIncreaseSalary;
    protected double annualSalary;


    static int countStaff;

    double increaseSalary(double salary, double percent) {
        plannedIncreaseSalary = salary * 0.01 * percent + salary;
        return plannedIncreaseSalary;
    }

    double yearSalary(double salary) {
        annualSalary = salary * 12;
        return annualSalary;
    }

    public Employee(int id, String firstName, String lastName,
                    double salary, double plannedIncreaseSalary,
                    double annualSalary) {

        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.plannedIncreaseSalary = increaseSalary(salary, 5);
        this.annualSalary = yearSalary(salary);
        countStaff++;
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee(1, "A", "A", 100, 0, 0);
        employees[1] = new Employee(1, "B", "D", 200, 0, 0);
        employees[2] = new Employee(1, "C", "C", 300, 0, 0);
        employees[3] = new Employee(1, "D", "D", 400, 0, 0);
        employees[4] = new Employee(1, "E", "E", 500, 0, 0);

        for (int i = 0; i < employees.length; i++) {
            System.out.println("Staff " + i + "/ firstName: " + employees[i].firstName + "/ salary: " + employees[i].salary +
                    "/ plannedIncreaseSalary: " + employees[i].plannedIncreaseSalary + "/ annualSalary: " + employees[i].annualSalary);
        }
        System.out.println("count:  "+countStaff);

    }
}