package com.example.restservice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@RequestMapping(path = "/employees")
public class EmployeeController {

    private EmployeeManager eManager = new EmployeeManager();

    @GetMapping("/employees")
    public Employees getEmployees(){
        return eManager.getAllEmployees();
    }
    

    // @GetMapping(path = "/", produces = "application/json")
    // public Employees getEmployees(){
    //     return eManager.getAllEmployees();
    // }

    // @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
    // public ResponseEntity<Object> addEmployee(@RequestBody Employee employee){
    //     Integer id = eManager.getAllEmployees().getEmployees().size() + 1;
    //     employee.setId(id);
    //     URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(employee.getId()).toUri();

    //     return ResponseEntity.created(location).build();
    // }

    // private static final String template = "Hello, %s!";
	// private final AtomicLong counter = new AtomicLong();

	// @GetMapping("/employeemanager")
    // public EmployeeManager eManager(@RequestParam()){
    // }
	
}
