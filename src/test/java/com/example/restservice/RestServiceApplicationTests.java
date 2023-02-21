package com.example.restservice;

import java.util.List;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.restservice.Employee;
import com.example.restservice.Employees;
import com.example.restservice.EmployeeManager;



@SpringBootTest
public class RestServiceApplicationTests {

    @Mock
	private EmployeeManager employeeManager;

	// Helper function to get the number of current employees
	int getEmployeeCount(EmployeeManager manager)
	{
		return manager.getAllEmployees().getEmployees().size();
	}

	@Test
	// Ensure that employee list is populated on initialization
	void createEmployeeManager() {
		EmployeeManager newEmployeeManager = new EmployeeManager();
		assert(getEmployeeCount(newEmployeeManager) != 0);
	}

	@Test
	// Ensure that adding an employee increases the employee count by 1
	void addEmployee() {
		EmployeeManager employeeManager = new EmployeeManager();
		int employeeCount = getEmployeeCount(employeeManager);
		Employee employee = new Employee("0005", "Happy", "Moon", "happymoon@gmail.com", "Ms.");
		employeeManager.addEmployee(employee);
		assert(employeeCount + 1 == getEmployeeCount(employeeManager));
	}

	@ExtendWith(MockitoExtension.class)
    @BeforeEach void setUp()
    {
		this.employeeManager = new EmployeeManager();
		Employee newEmployee = new Employee("0005", "Happy", "Moon", "happymoon@gmail.com", "Ms.");
		this.employeeManager.addEmployee(newEmployee);
    }

	@Test
	// Check whether added employee ID is found in ID field
	void employeeIdInList() {
		List<Employee> employees = this.employeeManager.getAllEmployees().getEmployees();
		for (int i=0; i<employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getEmployee_id() == "0005")
			{
				return;
			}
		}
		assert(false);
	}

	@Test
	// Check whether added employee first name is found in first name field
	void employeeFirstNameInList() {
		List<Employee> employees = this.employeeManager.getAllEmployees().getEmployees();
		for (int i=0; i<employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getFirst_name() == "Happy")
			{
				return;
			}
		}
		assert(false);
	}

	@Test
	// Check whether added employee last name is found in last name field
	void employeeLastNameInList() {
		List<Employee> employees = this.employeeManager.getAllEmployees().getEmployees();
		for (int i=0; i<employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getLast_name() == "Moon")
			{
				return;
			}
		}
		assert(false);
	}

	@Test
	// Check whether added employee email is found in email field
	void employeeEmailInList() {
		List<Employee> employees = this.employeeManager.getAllEmployees().getEmployees();
		for (int i=0; i<employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getEmail() == "happymoon@gmail.com")
			{
				return;
			}
		}
		assert(false);
	}

	@Test
	// Check whether added employee title is found in title field
	void employeeTitleInList() {
		List<Employee> employees = this.employeeManager.getAllEmployees().getEmployees();
		for (int i=0; i<employees.size(); i++)
		{
			Employee employee = employees.get(i);
			if (employee.getTitle() == "Ms.")
			{
				return;
			}
		}
		assert(false);
	}
}
