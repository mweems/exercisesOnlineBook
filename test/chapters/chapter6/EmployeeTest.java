package chapters.chapter6;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class EmployeeTest {

    @Test
    public void createNewEmployeeWithNameSalaryandSupervisor(){
        Employee employee = new Employee("Matt Weems", "Paula Moughton", 65000);
        assertEquals("Matt Weems", Employee.getName());
        assertEquals("Paula Moughton", Employee.getSupervisor());
        assertEquals(65000, Employee.getSalary());
    }
}
