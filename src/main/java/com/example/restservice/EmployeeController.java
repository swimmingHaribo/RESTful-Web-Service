package com.example.restservice;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    private EmployeeManager employeeManager;

    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    @GetMapping("/employees")
    public ResponseEntity<String> getAllEmployees() {
        Employees employees = employeeManager.getAllEmployees();

        String json = employees.toJSON();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        return new ResponseEntity<>(json, headers, HttpStatus.OK);
    }

    @PostMapping("/employees")
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
        employeeManager.addEmployee(employee);
        Employees employees = employeeManager.getAllEmployees();

        String json = employees.toJSON();

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        return new ResponseEntity<>(json, headers, HttpStatus.OK);
    }
}



// method 2:

// import java.net.URI;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

// import com.example.restservice.Employee;
// import com.example.restservice.Employees;
// import com.example.restservice.EmployeeManager;


// // Creating the REST controller
// @RestController
// @RequestMapping(path = "/employees")
// public class EmployeeController {
  
//     @Autowired
//     private EmployeeManager employeeManager;

//     @GetMapping(path = "/", produces = "application/json")
//     public Employees getEmployees()
//     {
//         return employeeManager.getAllEmployees();
//     }

//     @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
//     public ResponseEntity<Object> addEmployee(@RequestBody Employee employee)
//     {
//         employeeManager.addEmployee(employee);
  
//         URI location = ServletUriComponentsBuilder
//                   .fromCurrentRequest()
//                   .path("/{id}")
//                   .buildAndExpand(employee.getEmployee_id())
//                   .toUri();
  
//         return ResponseEntity.created(location).build();
//     }
// }





// other attemptted methods:

//     @GetMapping("/employees")
//     public ResponseEntity<String> getAllEmployees() throws JsonProcessingException {
//         Employees employees = employeeManager.getAllEmployees();

//         ObjectMapper mapper = new ObjectMapper();
//         String json = mapper.writeValueAsString(employees);

//         HttpHeaders headers = new HttpHeaders();
//         headers.setContentType(MediaType.APPLICATION_JSON);

//         return new ResponseEntity<>(json, headers, HttpStatus.OK);
//     }

//     @PostMapping("/employees")
//     public ResponseEntity<String> addEmployee(@RequestBody Employee employee) throws JsonProcessingException {
//         employeeManager.addEmployee(employee);
//         Employees employees = employeeManager.getAllEmployees();

//         ObjectMapper mapper = new ObjectMapper();
//         String json = mapper.writeValueAsString(employees);

//         HttpHeaders headers = new HttpHeaders();
//         headers.setContentType(MediaType.APPLICATION_JSON);

//         return new ResponseEntity<>(json, headers, HttpStatus.OK);
//     }
// }


    // @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
    // public ResponseEntity<Object> addEmployee(@RequestBody Employee employee){
    //     Integer id = eManager.getAllEmployees().getEmployees().size() + 1;
    //     employee.setId(id);
    //     URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(employee.getId()).toUri();

    //     return ResponseEntity.created(location).build();
    // }

