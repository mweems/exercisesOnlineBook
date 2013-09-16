package chapters.chapter6;

public class Employee {
    private static String name;
    private static String supervisor;
    private static int salary;

    public Employee(String name, String supervisor, int salary) {
        this.name = name;
        this.supervisor = supervisor;
        this.salary = salary;
    }

    public static String getName() {
        return name;
    }

    public static String getSupervisor() {
        return supervisor;
    }

    public static int getSalary() {
        return salary;
    }
}
