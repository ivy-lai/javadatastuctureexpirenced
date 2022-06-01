package Practice_Ivy;

import lists.classes.Employee;

import java.util.ArrayList;
import java.util.List;

public class TryOutArrayList {
    public static void main(String[] args){
        List<Employee> employeeList = new ArrayList();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));
        employeeList.add(new Employee("Bob", "Smith", 7777));

        Employee e1 = new Employee("Matt", "Smith", 1234);
        employeeList.add(e1);


        employeeList.forEach(e -> {
            System.out.println(e.toString());
        });

        employeeList.remove(0);
        System.out.println(employeeList.indexOf(new Employee("Bob", "Smith", 7777)));
        System.out.println(employeeList.contains(new Employee("Jane", "Jones", 123)));

    }

}
