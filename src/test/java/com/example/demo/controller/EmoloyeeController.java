package com.example.demo.controller;

import javax.management.RuntimeErrorException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.sanitization.EmployeeControllerSanitization;
import com.example.demo.service.EmployeeServiceIfc;
import com.example.demo.service.EmployeeServiceImpl;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(controllers = EmployeeController.class)
public class EmoloyeeController {
	@Autowired
	private WebApplicationContext context;
	@Autowired
	private MockMvc mockMvc;
	@MockBean
	private EmployeeServiceImpl employeeServiceImpl;
	@MockBean
	private EmployeeServiceIfc employeeServiceIfc;
	@Autowired
	private EmployeeControllerSanitization sanitization;

	@BeforeEach
	public void Setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(context).build();

		System.out.println("Employee");
	}

	@Test
	public void addEmployeeDetails() throws Exception {
		EmployeeDto employee = new EmployeeDto();

		System.out.println("This is a Controoler Test");

		mockMvc.perform(MockMvcRequestBuilders.post("/api/addemployee")
				.contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(employee)))
		        .andExpect(MockMvcResultMatchers.status()
		        .isOk());
	}

	public String asJsonString(Object object) {
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			return objectMapper.writeValueAsString(object);

		} catch (Exception e) {

			throw new RuntimeException(e);

		}

	}
}