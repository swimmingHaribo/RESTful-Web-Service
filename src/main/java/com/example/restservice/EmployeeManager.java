package com.example.restservice;
//import java.util.*;
// import java.util.ArrayList;
// import java.util.List;

public class EmployeeManager {
    private static Employees empList = new Employees();
    static{
        empList.getEmployeeList().add(
            new Employee(
                "0001",
                "Alex",
                "Winter",
                "alexwinter@gmail.com",
                "Ms."
            )
        );

        empList.getEmployeeList().add(
            new Employee(
                "0002",
                "AQ",
                "Shell",
                "aqshell@gmail.com",
                "Dr."
            )
        );

        empList.getEmployeeList().add(
            new Employee(
                "0003",
                "Happy",
                "Moon",
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
