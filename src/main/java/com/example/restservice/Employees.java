package com.example.restservice;
import java.util.ArrayList;
import java.util.List;

public class Employees {
    
    private List<Employee> employees;

    public List<Employee> getEmployees(){
  
        if (employees == null) {
            employees = new ArrayList<>();
        }
  
        return employees;
           
    }
  
    public void setEmployees(List<Employee> employees){
        this.employees = employees;
    }

    public String toJSON() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("  \"Employees\": [\n");
        for (int i = 0; i < employees.size(); i++) {
            sb.append("    {\n");
            sb.append("      \"employee_id\": \"" + employees.get(i).getEmployee_id() + "\",\n");
            sb.append("      \"first_name\": \"" + employees.get(i).getFirst_name() + "\",\n");
            sb.append("      \"last_name\": \"" + employees.get(i).getLast_name() + "\",\n");
            sb.append("      \"email\": \"" + employees.get(i).getEmail() + "\",\n");
            sb.append("      \"title\": \"" + employees.get(i).getTitle() + "\"\n");
            if (i == employees.size() - 1) {
                sb.append("    }\n");
            } else {
                sb.append("    },\n");
            }
        }
        sb.append("  ]\n");
        sb.append("}\n");
        return sb.toString();
    }
}
