package com.edureka.ms.employeeDetails;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mockito;
import com.edureka.ms.employeedetails.controller.EmployeeController;

public class EmployeeControllerTest {

	EmployeeController employeeController;
	
	
	@BeforeEach()
	public void before() {
		employeeController = new EmployeeController();
		//employeeController. = Mockito.mock(.class);
		
	}
	
}
