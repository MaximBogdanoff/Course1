public class Main {

    private static Employee[] employees = new Employee[10];

    static void base() {
        employees[0] = new Employee("Иванов Иван Иванович ", Employee.enumerator, 5000, 1);
        employees[1] = new Employee("Петров Петр Петрович ", Employee.enumerator, 10000, 2);
        employees[2] = new Employee("Юрьев Юрий Юрьевич ", Employee.enumerator, 15000, 3);
        employees[3] = new Employee("Сергеев Сергей Сергеевич ", Employee.enumerator, 20000, 4);
        employees[4] = new Employee("Павлов Павел Павлович ", Employee.enumerator, 25000, 5);
        employees[5] = new Employee("Денисов Денис Денисович ", Employee.enumerator, 30000, 1);
        employees[6] = new Employee("Максимов Максим Максимович ", Employee.enumerator, 35000, 2);
        employees[7] = new Employee("Евгеньев Евгений Евгеньевич ", Employee.enumerator, 40000, 3);
        employees[8] = new Employee("Александров Александр Александрович ", Employee.enumerator, 45000, 4);
        employees[9] = new Employee("Андреев Андрей Андреевич ", Employee.enumerator, 50000, 5);
    }

    public static void main(String[] args) {
        base();
        printEmployee();
        printMin_MaxSalaryEmployee();
        System.out.println("Сумма затрат на ЗП в месяц: " + getSalaryEmployees());
        System.out.println("Среднее значение зарплат: " + getSalaryEmployees() / employees.length);
        printEmployee();
    }

    private static void printEmployee() {
        for (int i = 0; i < employees.length; i++)
            System.out.println(employees[i]);
    }

    private static int getSalaryEmployees() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalaryEmployee();
        }
        return sum;
    }

    private static void printMin_MaxSalaryEmployee() {
        int minSalaryEmployee = employees[0].getSalaryEmployee();
        int maxSalaryEmployee = employees[0].getSalaryEmployee();
        String employeesMinSalary = employees[0].getFullNameEmployee();
        String employeesMaxSalary = employees[0].getFullNameEmployee();
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getSalaryEmployee() < minSalaryEmployee) {
                minSalaryEmployee = employees[i].getSalaryEmployee();
                employeesMinSalary = employees[i].getFullNameEmployee();
            }
            if (employees[i].getSalaryEmployee() > maxSalaryEmployee) {
                maxSalaryEmployee = employees[i].getSalaryEmployee();
                employeesMaxSalary = employees[i].getFullNameEmployee();
            }
        }
        System.out.println("Минимальная зарплата у сотрудника: " + employeesMinSalary + " равна: " + minSalaryEmployee);
        System.out.println("Максимальная зарплата у сотрудника: " + employeesMaxSalary + " равна: " + maxSalaryEmployee);
    }
}
