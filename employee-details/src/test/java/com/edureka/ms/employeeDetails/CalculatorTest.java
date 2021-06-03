package com.edureka.ms.employeeDetails;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.edureka.ms.employeedetails.controller.EmployeeController;
import com.edureka.ms.employeedetails.model.Calculator;
import com.edureka.ms.employeedetails.model.Employee;



@SpringBootTest
@AutoConfigureMockMvc
public class CalculatorTest {
	
	@Autowired
    private MockMvc mvc;

	
	@Test
	public void shouldAdd() {
		int a = Calculator.add(2,3);
		assertEquals(a, 5);
	}
	
	@Test
	public void shoudReturnEmployeeDipika() {
		EmployeeController ec = new EmployeeController();
		Employee emp1 = ec.getEmployeeDetails("5");
		assertEquals("Dipika", emp1.getEmpName());
		assertEquals("AST", emp1.getDesignation());
		assertEquals(13456777, emp1.getSalary());
	}
	
	
	@Test
	public void shoudReturnEmployeeDipikaUsingRest() throws Exception {
		mvc.perform(get("/employee/5"))
				.andDo(print())
		 		.andExpect(status().isOk())
		        .andExpect(jsonPath("$.empName", is("Dipika")));
	}
}
