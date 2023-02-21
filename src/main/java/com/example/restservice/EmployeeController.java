package com.example.restservice;
import java.util.concurrent.atomic.AtomicLong;

// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.restservice.Employees;
import com.example.restservice.Employee;
import com.example.restservice.EmployeeManager;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    private EmployeeManager eManager;

    @GetMapping(path = "/", produces = "application/json")
    public Employees getEmployees(){
        return eManager.getAllEmployees();
    }

    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(@RequestBody Employee employee){
        Integer id = eManager.getAllEmployees().getEmployeeList().size() + 1;
        employee.setId(id);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(employee.getId()).toUri();

        return ResponseEntity.created(location).build();
    }

    // private static final String template = "Hello, %s!";
	// private final AtomicLong counter = new AtomicLong();

	// @GetMapping("/employeemanager")
    // public EmployeeManager eManager(@RequestParam()){
    // }
	
}
