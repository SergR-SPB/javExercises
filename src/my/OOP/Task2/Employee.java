package my.OOP.Task2;

/*2. Написать класс Employee с полями id, firstName, lastName, salary.
//Cотрудник, идентификатор сотрудника, имя, фамилия, зарплата.
В классе предусмотреть методы для увеличения зарплаты на заданное количество %
//Planned increase in salary. и получения зарплаты за год.//annual salary*/
public class Employee {

    //модификаторы доступа private должны быть
    //список полей был указан! plannedIncreaseSalary и annualSalary в списке нет
    private int id;
    private String firstName;
    private String lastName;
    private long salary;        //деньги хранятся в целых числах для избежание ошибок округления
    //protected double plannedIncreaseSalary; //когда Вам увеличивают salary Вы продолжаете получать salary. Вы ж не получаете salary и plannedIncreaseSalary
    //protected double annualSalary;  //аналогично plannedIncreaseSalary


    private static int countStaff;

    //в принципе все равно и зависит от принятого стиля, но конструкторы чаще всего пишут после объъявления полей класса
    public Employee(int id, String firstName, String lastName,
                    long salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        countStaff++;
    }

    public static int getCountStaff() {
        return countStaff;
    }

    //для полей добавляем геттеры и сеттеры!


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percent) {
        salary *= 1 + percent;
    }

    public long annualSalary() {
        return salary * 12;
    }

    //переопределяем метод toString для вывода в консоль информации
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary / 100.0 +
                '}';
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        //id - это уникальный идентификатор. В задании проверку не надо делать, но... зачем же при создании объектов указывать всем одинаковый id
        employees[0] = new Employee(1, "A", "A", 10000L);
        employees[1] = new Employee(2, "B", "D", 20000L);
        employees[2] = new Employee(3, "C", "C", 30000L);
        employees[3] = new Employee(4, "D", "D", 40000L);
        employees[4] = new Employee(5, "E", "E", 50000L);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }
        System.out.println("count:  "+countStaff);

        System.out.println("\nIncrease all salary on 5%:");
        for (Employee employee : employees) {
            employee.increaseSalary(0.05);
            System.out.println(employee);
        }

        System.out.println("annual salary of an employee (with id = 1): " + employees[0].annualSalary());
    }
}