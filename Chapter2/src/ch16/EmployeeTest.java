package ch16;

public class EmployeeTest {

    public static void main(String[] args) {

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("Lee");

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("Kim");

        System.out.printf("%s님의 사번은 %d\n", employeeLee.getEmployeeName(), employeeLee.getEmployeeId());
        System.out.printf("%s님의 사번은 %d\n", employeeKim.getEmployeeName(), employeeKim.getEmployeeId());
    }
}
