package com.example.restservice;

public class EmployeeManager {
    private static Employees empList = new Employees();
    static{
        empList.getEmployees().add(
            new Employee(
                "0001",
                "Alex",
                "Winter",
                "alexwinter@gmail.com",
                "Ms."
            )
        );

        empList.getEmployees().add(
            new Employee(
                "0002",
                "AQ",
                "Shell",
                "aqshell@gmail.com",
                "Dr."
            )
        );

        empList.getEmployees().add(
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
        empList.getEmployees().add(employee);
    }
}
