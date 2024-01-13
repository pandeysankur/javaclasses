package ayush_javaCode.CheckEncapsulation;

import Ayush_Encapsulation.Employee;

public class OuterEmployee  {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.id= 10;
        emp1.name="Ayush";

        emp1.employeeDetails();
    }
}
