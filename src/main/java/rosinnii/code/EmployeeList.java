package rosinnii.code;

import java.util.ArrayList;

public class EmployeeList extends ArrayList<Employee> {
    private static final long serialVersionUID = 1L;
    private static EmployeeList instance;
    private EmployeeList() {
    }
    public static EmployeeList getInstance() {
        if (instance == null) {
            instance = new EmployeeList();
            instance.add(new Employee("Employee 1", "24.01.2000","male", 50000,"Java"));
            instance.add(new Employee("Employee 2", "12.02.2001","male", 50000,"Java"));
            instance.add(new Employee("Employee 3", "14.08.1972","male", 150000,"Java"));
            instance.add(new Employee("Employee 4", "30.04.1996","female", 80000,".NET"));
            instance.add(new Employee("Employee 5",  "08.03.1986","female", 80000,"Java"));
            instance.add(new Employee("Employee 6", "11.05.2001","male", 50000,".NET"));
            instance.add(new Employee("Employee 7", "07.07.1997","female", 80000,"Java"));
            instance.add(new Employee("Employee 8", "15.08.1997","male", 100000,"Java"));
            instance.add(new Employee("Employee 9", "20.09.1998","male", 50000,"Java"));
            instance.add(new Employee( "Employee 10", "25.10.1998","male", 50000,"GO"));
            instance.add(new Employee( "Employee 11", "26.12.2002","female", 35000,"PHP"));
            instance.add(new Employee( "Employee 12", "10.11.2000","female", 50000,"Java"));
        }
        return instance;
    }

}
