package org.example;

import org.example.configuration.MyConfig;
import org.example.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);

//get all Employees test
//        List<Employee> allEmployees =  communication.showAllEmployees();
//        System.out.println(allEmployees);

//get Employee by id test
//        Employee employee = communication.getEmployee(1);
//        System.out.println(employee);

//add new Employee test
//        Employee employee = new Employee("Sveta", "Sokolova", "HR" , 900);
//        communication.saveEmployee(employee);

//update Employee by id test
//        Employee employee = new Employee("Sveta", "Sokolova", "HR" , 900);
//        employee.setId(10);
//        communication.saveEmployee(employee);

//delete Employee by id test
//        communication.deleteEmployee(10);

    }
}
