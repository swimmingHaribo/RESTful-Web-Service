package com.example.restservice;
import java.util.ArrayList;
import java.util.List;

public class Employees {
    
    private List<Employee> Employees;

    public List<Employee> getEmployeeList(){
  
        if (Employees == null) {
            Employees = new ArrayList<>();
        }
  
        return Employees;
           
    }
  
    public void setEmployeeList(List<Employee> Employees){
        this.Employees = Employees;
    }

}
