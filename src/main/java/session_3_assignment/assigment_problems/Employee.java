package session_3_assignment.assigment_problems;

public class Employee {
    String empName;
    double salary;
    boolean permanent;

    public static void main(String[] args) {
        // Create one Employee object using new, without setting a single field
        Employee emp = new Employee();

        // Print all three fields right away, before assigning anything to them
        System.out.println("Name: " + emp.empName);
        System.out.println("Salary: " + emp.salary);
        System.out.println("Permanent: " + emp.permanent);
    }
}
