package com.example.restservice;

public class Employee {
    
    public Employee() {

    }
    
    public Employee(String first_name, String last_name, String employee_id, String email, String title) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.employee_id = employee_id;
        this.email = email;
        this.title = title;
    }

    public Employee(Integer id, String first_name, String last_name, String employee_id, String email, String title) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.employee_id = employee_id;
        this.email = email;
        this.title = title;
    }

    private Integer id;
    private String first_name;
    private String last_name;
    private String employee_id;
    private String email; 
    private String title;

    
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId(){
        return id;
    }
    public String getFirst_name() {
        return first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public String getEmployee_id() {
        return employee_id;
    }
    public String getEmail() {
        return email;
    }
    public String getTitle() {
        return title;
    }
    
}