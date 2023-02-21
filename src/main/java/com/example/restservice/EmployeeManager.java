package com.example.restservice;
import org.springframework.stereotype.Repository;
import com.example.restservice.Employees;

public class EmployeeManager {
    private static Employees empList = new Employees();
    static{
        empList.getEmployeeList().add(
            new Employee(
                "Alex",
                "Winter",
                "0001",
                "alexwinter@gmail.com",
                "Ms."
            )
        );

        empList.getEmployeeList().add(
            new Employee(
                "AQ",
                "Shell",
                "0002",
                "aqshell@gmail.com",
                "Dr."
            )
        );

        empList.getEmployeeList().add(
            new Employee(
                "Happy",
                "Moon",
                "0003",
                "happymoon@gmail.com",
                "Miss."
            )
        );
    }

    public Employees getAllEmployees(){
        return empList;
    }

    public void addEmployee(Employee employee){
        empList.getEmployeeList().add(employee);
    }
}
